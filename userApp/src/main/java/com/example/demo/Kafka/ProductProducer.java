package com.example.demo.Kafka;

import com.example.demo.Models.User;
import com.example.demo.Services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.HashMap;

public class ProductProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJSONProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;
    private final UserService userService;
    public ProductProducer(KafkaTemplate<String,User> kafkaTemplate, UserService userService)
    {
        this.kafkaTemplate = kafkaTemplate;
        this.userService = userService;
    }

    public void sendMessage(HashMap<String,Object> data)
    {

        LOGGER.info(String.format("Message sent %s",data.toString()));

        Message<HashMap<String,Object>> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"user-product")
                .build();

        kafkaTemplate.send(message);
    }
}
