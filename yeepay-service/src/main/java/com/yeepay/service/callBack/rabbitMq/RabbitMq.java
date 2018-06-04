package com.yeepay.service.callBack.rabbitMq;

import com.rabbitmq.client.*;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;


@Controller
public class RabbitMq {

//    @Autowired
//    RabbitConfig rabbitConfig;
//
//    @Autowired
//    AcquireConfig acquireConfig;

    public static String DIRECT_EXCHANGES = "amq.direct";//交换机

    public static String DEAD_LETTER_ROUTING = "DEAD_LETTER_ROUTING";//死信路由

    public static String DEAD_LETTER_QUEUE_NAME = "DEAD_LETTER_QUEUE";//死信队列名

    public static String DELAY_QUEUE = "DELAY_QUEUE";//延迟队列

    public String queue(String message, String time) throws IOException, TimeoutException, InterruptedException {

        ConnectionFactory factory = new ConnectionFactory();

//设置MabbitMQ所在主机ip或者主机名

        factory.setHost("localhost");

//创建一个连接

        Connection connection = factory.newConnection();

//创建一个频道

        Channel channel = connection.createChannel();

//指定一个队列

        channel.queueDeclare(DEAD_LETTER_QUEUE_NAME, true, false, false, null);

//发送的消息延迟30秒并且持久化

        AMQP.BasicProperties.Builder builder = new AMQP.BasicProperties.Builder();

        AMQP.BasicProperties properties = builder.expiration(time).deliveryMode(2).build();

//往队列中发出一条消息这时候要发送的队列不应该是QUEUE_NAME，这样才能进行转发的

            channel.basicPublish("",DELAY_QUEUE, properties, message.getBytes());

            System.out.println("Producer Sent_DELAY_QUEUE_"  + " : " + message + "");

//声明队列，主要为了防止消息接收者先运行此程序，队列还不存在时创建队列。

        channel.queueDeclare(DEAD_LETTER_QUEUE_NAME, true, false, false, null);

// channel.queueBind(QUEUE_NAME, "amq.direct", QUEUE_NAME);

        channel.queueBind(DEAD_LETTER_QUEUE_NAME,DIRECT_EXCHANGES, DEAD_LETTER_ROUTING);

//这里是创建死信并且绑定死信

        HashMap arguments = new HashMap<>();

        arguments.put("x-dead-letter-exchange", DIRECT_EXCHANGES);

        arguments.put("x-dead-letter-routing-key", DEAD_LETTER_ROUTING);

        channel.queueDeclare(DELAY_QUEUE, true, false, false, arguments);

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

//创建队列消费者

        QueueingConsumer consumer = new QueueingConsumer(channel);

//指定消费队列

        channel.basicConsume(DEAD_LETTER_QUEUE_NAME, true, consumer);

        while (true) {

//nextDelivery是一个阻塞方法（内部实现其实是阻塞队列的take方法）

            QueueingConsumer.Delivery delivery = consumer.nextDelivery();

            String result = new String(delivery.getBody());

            System.out.println(" [x] Received '" + message + "'");

            return result;
        }
    }
}
