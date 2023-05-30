package com.example.Driller.service;

import com.example.Driller.model.Message;
import com.example.Driller.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements IMessageService{

    private MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message createMessage(Message message) {
        return this.messageRepository.save(message);
    }

    @Override
    public List<Message> getMessages() {
        return this.messageRepository.findAll().stream().toList();
    }
}
