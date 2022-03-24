package com.scheduling.demoday21.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/delay")
public class DelayResponseAPI {

    @GetMapping("response")
    public String delay() throws InterruptedException {

        Thread.sleep(5000);
        return "response";
    }
}
