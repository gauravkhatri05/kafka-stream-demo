package org.accolite.study.service;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumer {

    @Bean
    public Consumer<KStream<String, Long>> squaredNumberConsumer() {
        return kStream -> kStream.foreach((k, v) -> System.out.println("Square Number Consumed: " + v));
    }
}
