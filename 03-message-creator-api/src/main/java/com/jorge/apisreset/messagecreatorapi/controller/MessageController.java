package com.jorge.apisreset.messagecreatorapi.controller;

import com.jorge.apisreset.messagecreatorapi.dto.CreateMessageRequest;
import com.jorge.apisreset.messagecreatorapi.dto.MessageResponse;
import com.jorge.apisreset.messagecreatorapi.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> createMessage(@RequestBody CreateMessageRequest request) {
        MessageResponse createdMessage = messageService.createMessage(request);
        URI location = URI.create("/api/v1/messages/" + createdMessage.id());

        return ResponseEntity.created(location).body(createdMessage);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageResponse> getMessage(@PathVariable("id") long id) {
        Optional<MessageResponse> message = messageService.findMessageById(id);

        if (message.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(message.get());
    }
}
