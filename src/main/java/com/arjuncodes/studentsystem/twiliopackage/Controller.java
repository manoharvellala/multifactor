package com.arjuncodes.studentsystem.twiliopackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/sms")
@CrossOrigin
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public void sendSms( @RequestBody SmsRequest smsRequest) {
        service.sendSms(smsRequest);
    }
}