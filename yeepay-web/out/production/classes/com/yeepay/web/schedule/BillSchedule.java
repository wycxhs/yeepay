package com.acquiring.bx.web.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BillSchedule {
    private static final Logger LOGGER = LoggerFactory.getLogger(BillSchedule.class);

//    @Autowired
//    BillService billService;

    @Scheduled(fixedDelay = 60 * 1000)
    public void notifyDelay() {
//        billService.bill();
    }

}
