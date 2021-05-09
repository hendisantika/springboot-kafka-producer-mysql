package com.hendisantika.springbootkafkaproducermysql.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kafka-producer-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/05/21
 * Time: 05.02
 */
@Service
public class KafkaConsumer {
    private final static String topic = "hendiTopic";
    private final static String groupId = "hendiGroup";
    public static List<String> messages = new ArrayList<>();

    @KafkaListener(topics = topic, groupId = groupId)
    public void listen(String message) {
        messages.add(message);
    }
}