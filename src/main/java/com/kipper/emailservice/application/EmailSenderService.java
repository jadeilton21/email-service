package com.kipper.emailservice.application;

import com.kipper.emailservice.adapters.EmailSenderGateway;
import com.kipper.emailservice.core.EMailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService  implements EMailSenderUserCase {


    private final EmailSenderGateway eMailSenderGateway;


    @Autowired
    public EmailSenderService(EmailSenderGateway eMailSenderGatewat){

        this.eMailSenderGateway = eMailSenderGatewat;

    }


    @Override
    public void sendEmail(String to, String subject, String body) {
        this.eMailSenderGateway.sendEmail(to,subject,body);
    }
}
