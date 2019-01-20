package com.rent.controller;

import com.rent.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.JmsListener;

import javax.jms.JMSException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

@SpringBootApplication

public class PurchasemoduleApplication implements CommandLineRunner {

    public static void main(String[] args){
        SpringApplication.run(PurchasemoduleApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {

    }

    @JmsListener(destination="rentalQueue")
        private static void queueListener(byte[] input) throws JMSException {


             //Message msg = jmsTemplate.receive("rentalQueue");

//             ByteArrayInputStream bis = new ByteArrayInputStream(yourBytes);
//             ObjectInput in = null;
//             try {
//                 in = new ObjectInputStream(bis);
//                 Object o = in.readObject();
//
//             } catch(IOException io){
//                 System.out.println(io.getStackTrace());
//             }
//             finally {
//                 try {
//                     if (in != null) {
//                         in.close();
//                     }
//                 } catch (IOException ex) {
//                     // ignore close exception
//                 }
//             }
//
//             System.out.println(msg.getJMSType() + msg.getJMSMessageID());
             if(input instanceof byte[]){
                 ByteArrayInputStream bis = new ByteArrayInputStream(input);
             ObjectInput in = null;
             Object o = null;
             try {
                 in = new ObjectInputStream(bis);
                  o = in.readObject();

             } catch(IOException  | ClassNotFoundException io ){
                 System.out.println("Issue with input or class"+io.getStackTrace());
                 System.out.println("Issue with input or class"+io.getMessage());
                 System.out.println("Issue with input or class"+io.getCause());
             }

             if(o instanceof User){
                 System.out.println("The input from queue is "+((User) o).getName());
             }

             }
                // System.out.println(((TextMessage)msg).getText());
             System.out.println("Exiting");
        }
}
