package com.bergamota.kafkaexample.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public static  final String KAFKA_EXAMPLE_TOPIC = "jetersonkafkaexample";


    @Bean
    public NewTopic kafkaExampleTopic() {
        return TopicBuilder.name(KAFKA_EXAMPLE_TOPIC).build();
    }

}
