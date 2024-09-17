package com.example.consumer;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.dto.Customer;

import org.slf4j.Logger;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);


     @KafkaListener(topics = "customer-example", groupId = "hello")
    public void consumeEvents(Customer customer) {
        log.info("Consumer consumed the events {}", customer.toString());
    }
    // @KafkaListener(topics = "payments-demo-3", groupId = "payments-group-1")
    // public void consume1(String message) {
    //     log.info("Consumer1 consumed the messages {}", message);
    // }
    //  @KafkaListener(topics = "payments-demo-3", groupId = "payments-group-1")
    //  public void consume2(String message) {
    //      log.info("Consumer2 consumed the messages {}", message);
    //  }
    //  @KafkaListener(topics = "payments-demo-3", groupId = "payments-group-1")
    //  public void consume3(String message) {
    //      log.info("Consumer3 consumed the messages {}", message);
    //  }
    
    //   @KafkaListener(topics = "payments-demo-3", groupId = "payments-group-1")
    // public void consume4(String message) {
    //     log.info("Consumer4 consumed the messages {}", message);
    // }
}
