package com.example.Driller.controller;

import com.example.Driller.model.Message;
import com.example.Driller.service.IMessageService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    private IMessageService messageService;

    @Autowired
    public MessageController(IMessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/message/create")
    public ResponseEntity<Message> createMessage(@RequestBody Message message){
        return ResponseEntity.ok(messageService.createMessage(message));
    }
    @GetMapping("/messages")
    public ResponseEntity<List<Message>> getMessages(){
        return ResponseEntity.ok(messageService.getMessages());
    }
}
