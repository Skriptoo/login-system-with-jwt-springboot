package com.example.Driller.service;

import com.example.Driller.model.Message;

import java.util.List;

public interface IMessageService {
    Message createMessage(Message message);
    List<Message> getMessages();
}
