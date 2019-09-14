package com.tamirkash.kafka.consumer.listener;

import com.tamirkash.kafka.consumer.model.Traveler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "new_traveler", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public void consume(Traveler traveler) {
        System.out.println(traveler);
    }
}
