package com.bergamota.kafkaexample.kafkaexample.listeners;

import com.bergamota.kafkaexample.kafkaexample.config.KafkaProducerConfig;
import com.bergamota.kafkaexample.kafkaexample.config.KafkaTopicConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    private Logger log = LoggerFactory.getLogger(KafkaListeners.class);

    @KafkaListener(topics = KafkaTopicConfig.KAFKA_EXAMPLE_TOPIC, groupId = "groupId-1")
    private void listener(String data) {
        log.info("Message received from kafka topic {} = {}", KafkaTopicConfig.KAFKA_EXAMPLE_TOPIC, data);
    }
}
