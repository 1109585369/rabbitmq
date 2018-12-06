package com.spring.boot.rabbitmq.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yy
 * @ProjectName rabbitmq
 * @Description: TODO
 * @date 2018/11/8 15:43
 */
@Service
public class Receiver {

//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    @RabbitListener(queues = "spring-boot-simple")
//    public void receiveMessage(String message){
//        System.out.println("Received <" + message + ">");
//    }

    public void receiveMessage(String message){
        System.out.println("Received<" + message + ">");
    }


}
