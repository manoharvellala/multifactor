package com.arjuncodes.studentsystem.twiliopackage;


public interface SmsSender {

    void sendSms(SmsRequest smsRequest);

    // or maybe void sendSms(String phoneNumber, String message);
}