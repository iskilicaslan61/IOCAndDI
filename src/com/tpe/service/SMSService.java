package com.tpe.service;

import com.tpe.domain.Message;

public class SMSService {

    public void sendMessage(Message message) {
        System.out.println("This is the SMS service. You have a new message: "+message.getMessage());
    }
}
