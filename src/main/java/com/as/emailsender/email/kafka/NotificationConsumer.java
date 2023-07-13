package com.as.emailsender.email.kafka;

import com.as.emailsender.email.kafka.dto.NotificationDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationConsumer {

    private final ObjectMapper objectMapper;

    @SqsListener(value = "my-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receiveMessage(String notificationDto) throws JsonProcessingException {
        System.out.println("Received Message in group notifications: " + objectMapper.readValue(notificationDto, NotificationDto.class));
    }
}
