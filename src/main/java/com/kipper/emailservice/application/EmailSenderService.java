package com.kipper.emailservice.application;

import com.kipper.emailservice.core.EMailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService  implements EMailSenderUserCase {


    private final EMailSenderGateway eMailSenderGateway;


    @Autowired
    public EmailSenderService(EMailSenderGateway eMailSenderGatewat){

    }


    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
