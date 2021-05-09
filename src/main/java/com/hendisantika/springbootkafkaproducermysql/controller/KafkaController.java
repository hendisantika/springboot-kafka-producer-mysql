package com.hendisantika.springbootkafkaproducermysql.controller;

import com.hendisantika.springbootkafkaproducermysql.service.KafkaConsumer;
import com.hendisantika.springbootkafkaproducermysql.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kafka-producer-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/05/21
 * Time: 05.03
 */
@RestController
public class KafkaController {
    @Autowired
    private KafkaConsumer consumer;

    @Autowired
    private KafkaProducer producer;

    @PostMapping("/send")
    public void send(@RequestBody String data) {
        producer.produce(data);
    }

    @GetMapping("/receive")
    public List<String> receive() {
        return KafkaConsumer.messages;
    }
}
