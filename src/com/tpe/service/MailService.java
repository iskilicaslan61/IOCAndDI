package com.tpe.service;

import com.tpe.domain.Message;

public class MailService {

    public void sendMessage(Message message){

        System.out.println("This is the mail service. You have a new message: "+message.getMessage());

    }



}