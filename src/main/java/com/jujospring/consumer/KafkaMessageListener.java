package com.jujospring.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

  Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);


  // @KafkaListener(topics = "jujospring-topic7", groupId = "jujo-group")
  // public void consumeEvents(Customer customer) {
  //   log.info("Consumer consumed the events {} ", customer.toString());
  // }


  @KafkaListener(topics = "jujospring-topic8", groupId = "jujo-group", topicPartitions={@TopicPartition(topic = "jujospring-topic8", partitions = {"2"})})
  public void consumeEvents(String customer) {
    log.info("Consumer consumed the events {} ", customer);
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
