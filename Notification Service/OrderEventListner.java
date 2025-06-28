package com.mic_new.notification_service;

import org.springframework.stereotype.Component;


import org.springframework.kafka.annotation.KafkaListener;

@Component
public class OrderEventListner {

    @KafkaListener(id = "Order Event Listener",topics = "orderTopic")
    public void consume(String topic)
    {
        System.out.println("Event Received");
    }
}
