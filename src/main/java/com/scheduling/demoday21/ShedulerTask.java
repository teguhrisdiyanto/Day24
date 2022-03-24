package com.scheduling.demoday21;


import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Component
public class ShedulerTask {

//    private static final Logger logger = LoggerFactory.getLogger(ShedulerTask.class);

    private static final DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("HH:mm:ss");


//    @Scheduled(fixedRate = 1000)
//    public void scheduleTaskWithFixedRate(){
//
//        System.out.println("fixed rate : " + dateTimeFormater.format(LocalDateTime.now()));
//    }


//    @Scheduled(fixedDelay = 1000)
//    public void scheduleTaskWithFixedDelay() throws InterruptedException {
//        System.out.println("fixed dalay : " + dateTimeFormater.format(LocalDateTime.now()));
//        TimeUnit.SECONDS.sleep(5);
//        System.out.println("test" + dateTimeFormater.format(LocalDateTime.now()));
//
//    }

    @Scheduled(cron = "1 * * * * ?")
    public void cron(){

        System.out.println("cron app : " + dateTimeFormater.format(LocalDateTime.now()));
    }
}
