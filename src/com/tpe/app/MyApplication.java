package com.tpe.app;

import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;

public class MyApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setMessage("Your package has arrived!");

        // Let's send it with MailService!
        //MailService mailService = new MailService();
        //mailService.sendMessage(message);

        // Let's send it with SMS Service!
        //SMSService smsService = new SMSService();
        //smsService.sendMessage(message);

        // Interface?
        //MessageService service = new MailService();
//        MessageService service = new SMSService();
//        service.sendMessage(message);

        // Specify the service type before the main starts

        MessageService messageService;
        String serviceType = "x";     // The default service will now be the Mail Service.

        if (args.length>0){
            serviceType = args[0];
        }
        if (serviceType.equalsIgnoreCase("MailService"))
            messageService = (MessageService) new MailService();
        else
            messageService = (MessageService) new SMSService();

        messageService.sendMessage(message);



    }

}