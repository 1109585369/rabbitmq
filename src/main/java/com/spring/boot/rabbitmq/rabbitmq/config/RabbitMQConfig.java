package com.spring.boot.rabbitmq.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yy
 * @ProjectName rabbitmq
 * @Description: TODO
 * @date 2018/11/8 15:33
 */
@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "spring-boot-simple";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE_NAME);
    }

}
