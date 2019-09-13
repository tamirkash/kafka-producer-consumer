package com.tamirkash.kafka.producer.resource;

import com.tamirkash.kafka.producer.model.Traveler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Taveler {
    @Autowired
    private KafkaTemplate<String, Traveler> travelerTemplate;

    private static final String TOPIC = "new_traveler";

    @PostMapping("/publish")
    public String post(@RequestBody Traveler traveler) {
        travelerTemplate.send(TOPIC, traveler);
        System.out.println(traveler);

        return "Published Successfully";
    }
}
