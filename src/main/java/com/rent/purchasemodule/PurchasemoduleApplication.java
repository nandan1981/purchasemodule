package com.rent.purchasemodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@SpringBootApplication

public class PurchasemoduleApplication {

    public static void main(String[] args){
        SpringApplication.run(PurchasemoduleApplication.class, args);


    }
         @JmsListener(destination="rentalQueue")
        private static void queueListener(JmsTemplate jmsTemplate) throws JMSException {

             Message msg = jmsTemplate.receive("rentalQueue");
             System.out.println(msg.getJMSType() + msg.getJMSMessageID());
             if(msg instanceof TextMessage)
                 System.out.println(((TextMessage)msg).getText());
        }
}
