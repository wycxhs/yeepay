package com.yeepay.common.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.*;

public class HttpUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpUtils.class);
    private static PoolingHttpClientConnectionManager connMgr;

    public static final String CHARSET_UTF8 = "UTF-8";
    private static final int MAX_TIMEOUT = 70000;
    public static final int CONNECTION_TIMEOUT = 60000;// 连接超时时间

    // public static final int SOCKET_TIMEOUT = 30000;//回应超时时间
    public static final int SOCKET_TIMEOUT = 60000;// 回应超时时间

    private static RequestConfig requestConfig;

    static {
        // 设置连接池
        connMgr = new PoolingHttpClientConnectionManager();
        // 设置连接池大小
        connMgr.setMaxTotal(100);
        connMgr.setDefaultMaxPerRoute(connMgr.getMaxTotal());

        RequestConfig.Builder configBuilder = RequestConfig.custom();
        // 设置连接超时
        configBuilder.setConnectTimeout(MAX_TIMEOUT);
        // 设置读取超时
        configBuilder.setSocketTimeout(MAX_TIMEOUT);
        // 设置从连接池获取连接实例的超时
        configBuilder.setConnectionRequestTimeout(MAX_TIMEOUT);
        // 在提交请求之前 测试连接是否可用
        configBuilder.setStaleConnectionCheckEnabled(true);
        requestConfig = configBuilder.build();
    }

    /**
     * @Title: sendSOAP12Request @Description: 发送soap协议 @param @param
     * url @param @param xml @param @param charset @param @return @return
     * String @throws
     */
    public static String sendSOAP12Request(String url, String xml, String charset) {
        String usedCharset = (charset == null ? CHARSET_UTF8 : charset);
        OutputStream out = null;
        try {
            HttpURLConnection conn = (HttpURLConnection) (new URL(url)).openConnection();
            conn.setRequestMethod("POST");
            // 设置超时时间
            conn.setConnectTimeout(CONNECTION_TIMEOUT);
            conn.setReadTimeout(SOCKET_TIMEOUT);
            conn.addRequestProperty("Content-Length", String.valueOf(xml.length()));
            conn.addRequestProperty("Content-Type", "application/soap+xml; charset=" + usedCharset);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            out = conn.getOutputStream();
            out.write(xml.getBytes());
            out.close();
            out = null;
            int code = conn.getResponseCode();
            if (code != 200) {
                LOGGER.info("SOAP12 request failed: {} for {}", code, url);
                return null;
            }
            return readInputStream(conn);
        } catch (Exception e) {
            LOGGER.error("sendSOAP12Request failed:", e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    LOGGER.error("close output stream failed:", e);
                }
            }
        }
        return null;
    }

    private static String readInputStream(HttpURLConnection conn) {
        ByteArrayOutputStream respStream = new ByteArrayOutputStream();
        InputStream in = null;
        try {
            in = conn.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = in.read(buffer)) > 0) {
                respStream.write(buffer, 0, len);
            }
            return respStream.toString();
        } catch (IOException e) {
            LOGGER.error("read response stream failed:", e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failed:", e);
                }
            }
            try {
                respStream.close();
            } catch (IOException e) {
                LOGGER.error("close response stream failed:", e);
            }
        }
        return null;
    }

    /**
     * httpGet请求
     *
     * @param url
     * @return
     */
    public static String doGetRequest(String url) {
        // TODO 有待优化
        CloseableHttpClient httpclient = null;
        CloseableHttpResponse response = null;
        try {
            httpclient = HttpClients.createDefault();
            // 创建httpget.
            HttpGet httpget = new HttpGet(url);
            // 执行get请求.
            response = httpclient.execute(httpget);
            // 获取响应实体
            HttpEntity entity = response.getEntity();

            // 打印响应状态
            System.out.println(response.getStatusLine().getStatusCode());
            if (entity != null) {
                // 打印响应内容
                return EntityUtils.toString(entity);
            }
        } catch (Exception e) {
            LOGGER.error("请求异常:", e);
        } finally {
            try {
                httpclient.close();
                response.close();
            } catch (IOException e) {
                LOGGER.error("请求异常:", e);
            }
        }
        return null;
    }

    public static String doPost(String url, Map<String, String> param, String charset) {

        StringBuffer buffer = new StringBuffer();
        if (param != null && !param.isEmpty()) {
            for (Map.Entry<String, String> entry : param.entrySet()) {
                buffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue())).append("&");
            }
        }
        buffer.deleteCharAt(buffer.length() - 1);

        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(buffer);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 处理post请求.
     *
     * @param url    请求路径
     * @param params 参数
     * @return json
     */
    public static String doPost(String url, Map<String, Object> params) {
        // 实例化httpClient
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 实例化post方法
        HttpPost httpPost = new HttpPost(url);
        // 处理参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        Set<String> keySet = params.keySet();
        for (String key : keySet) {
            if (params.get(key) != null) {
                nvps.add(new BasicNameValuePair(key, params.get(key).toString()));
            }
        }
        // 结果
        CloseableHttpResponse response = null;
        String content = "";
        try {
            // 提交的参数
            UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(nvps, "UTF-8");
            // 将参数给post方法
            httpPost.setEntity(uefEntity);
            // 执行post方法
            response = httpclient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                content = EntityUtils.toString(response.getEntity(), "utf-8");
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static String doPost(String apiUrl, Object json) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String httpStr = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        CloseableHttpResponse response = null;
        try {
            httpPost.setConfig(requestConfig);
            LOGGER.info("请求参数@{}", json.toString());
            StringEntity stringEntity = new StringEntity(json.toString(), "UTF-8");// 解决中文乱码问题
            stringEntity.setContentEncoding("UTF-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return httpStr;
    }

    public static String doPost(String apiUrl, String json) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String httpStr = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        CloseableHttpResponse response = null;
        try {
            httpPost.setConfig(requestConfig);
            LOGGER.info("请求参数@{}", json);
            StringEntity stringEntity = new StringEntity(json, "UTF-8");// 解决中文乱码问题
            stringEntity.setContentEncoding("UTF-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return httpStr;
    }

    private static String concatParams(Map<String, String> urlParam) {
        Object[] key_arr = urlParam.keySet().toArray();
        Arrays.sort(key_arr);
        String str = "";
        for (Object key : key_arr) {
            String val = urlParam.get(key);
            str += "&" + key + "=" + val;
        }
        return str.replaceFirst("&", "");
    }

    private static String byte2hex(byte[] b) {
        StringBuffer buf = new StringBuffer();
        int i;
        for (int offset = 0; offset < b.length; offset++) {
            i = b[offset];
            if (i < 0)
                i += 256;
            if (i < 16)
                buf.append("0");
            buf.append(Integer.toHexString(i));
        }
        return buf.toString();
    }

    /**
     * 下载文件
     *
     * @param url
     */
    public static File downloadFile(String url, File file) throws Exception {
        // 生成一个httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        InputStream in = entity.getContent();
        if (!file.exists()) {
            file.createNewFile();
        }
        try {
            FileOutputStream fout = new FileOutputStream(file);
            int l = -1;
            byte[] tmp = new byte[1024];
            while ((l = in.read(tmp)) != -1) {
                fout.write(tmp, 0, l);
                // 注意这里如果用OutputStream.write(buff)的话，图片会失真，大家可以试试
            }
            fout.flush();
            fout.close();
        } finally {
            // 关闭低层流。
            in.close();
        }
        httpclient.close();
        return file;
    }
}
