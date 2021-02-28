package com.julio.producer.services;

import com.julio.producer.models.Message;

public interface MessageService {
    void publishMessage(Message message);
}
