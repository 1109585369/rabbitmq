package com.spring.boot.rabbitmq.rabbitmq.service;

import com.spring.boot.rabbitmq.rabbitmq.config.RabbitMQConfig;
import com.spring.boot.rabbitmq.rabbitmq.config.RabbitMQConfig2;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yy
 * @ProjectName rabbitmq
 * @Description: TODO
 * @date 2018/11/8 15:41
 */
@Service
public class Sender {

    @Autowired
    AmqpTemplate rabbitTemplate;

    public void sender(){
        System.out.println("rabbit sender");
        rabbitTemplate.convertAndSend(RabbitMQConfig2.QUEUE_NAME,"hello rabbit");
    }

}
