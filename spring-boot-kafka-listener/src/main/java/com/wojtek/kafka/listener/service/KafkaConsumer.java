package com.wojtek.kafka.listener.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consumeMessage(String message) {
        LOG.info("Received message: " + message);
    }
}
