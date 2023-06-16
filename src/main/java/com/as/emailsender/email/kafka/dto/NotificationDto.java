package com.as.emailsender.email.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
    private String content;

    private LocalDate issueDate;

    private Set<String> emailAddresses;
}