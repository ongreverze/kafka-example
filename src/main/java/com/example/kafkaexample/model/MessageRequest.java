package com.example.kafkaexample.model;


import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {
    private String message;
}
