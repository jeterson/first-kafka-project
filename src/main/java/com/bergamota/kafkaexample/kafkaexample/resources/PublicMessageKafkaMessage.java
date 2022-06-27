package com.bergamota.kafkaexample.kafkaexample.resources;

import com.bergamota.kafkaexample.kafkaexample.config.KafkaTopicConfig;
import com.bergamota.kafkaexample.kafkaexample.resources.dto.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produces")
public class PublicMessageKafkaMessage {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send(KafkaTopicConfig.KAFKA_EXAMPLE_TOPIC, messageRequest.message());
    }
}
