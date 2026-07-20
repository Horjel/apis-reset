package com.jorge.apisreset.messagecreatorapi.service;

import com.jorge.apisreset.messagecreatorapi.dto.CreateMessageRequest;
import com.jorge.apisreset.messagecreatorapi.dto.MessageResponse;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MessageService {

    private final AtomicLong idGenerator = new AtomicLong();
    private final Map<Long, MessageResponse> messages = new ConcurrentHashMap<>();

    public MessageResponse createMessage(CreateMessageRequest request) {
        long id = idGenerator.incrementAndGet();
        MessageResponse message = new MessageResponse(id, request.author(), request.content());

        messages.put(id, message);

        return message;
    }
}
