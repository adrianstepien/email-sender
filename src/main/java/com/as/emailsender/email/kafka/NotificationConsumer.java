package com.as.emailsender.email.kafka;

import com.as.emailsender.email.kafka.dto.NotificationDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "${kafka.notification.topic}", groupId = "notifications", containerFactory = "kafkaListenerContainerFactory")
    public void notificationConsumer(NotificationDto notificationDto) {
        System.out.println("Received Message in group notifications: " + notificationDto);
    }
}
