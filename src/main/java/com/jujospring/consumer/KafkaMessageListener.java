package com.jujospring.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.jujospring.dto.Customer;

@Service
public class KafkaMessageListener {

  Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);


  @KafkaListener(topics = "jujospring-demo6", groupId = "jujo-group")
  public void consumeEvents(Customer customer) {
    log.info("Consumer consumed the events {} ", customer.toString());
  }

  // @KafkaListener(topics = "jujospring-demo4", groupId = "jujo-group")
  // public void consume2(String message) {
  //   log.info("Consumer2 consumed the message{} ", message);
  // }

  // @KafkaListener(topics = "jujospring-demo4", groupId = "jujo-group")
  // public void consume3(String message) {
  //   log.info("Consumer3 consumed the message{} ", message);
  // }

  // @KafkaListener(topics = "jujospring-demo4", groupId = "jujo-group")
  // public void consume4(String message) {
  //   log.info("Consumer4 consumed the message{} ", message);
  // }
}
