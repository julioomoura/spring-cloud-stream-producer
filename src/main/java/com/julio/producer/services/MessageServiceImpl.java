package com.julio.producer.services;

import com.julio.producer.models.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final StreamBridge streamBridge;

    @Override
    public void publishMessage(Message message) {
        log.info(message.getMsg());
        streamBridge.send("bindingName", message);
    }
}
