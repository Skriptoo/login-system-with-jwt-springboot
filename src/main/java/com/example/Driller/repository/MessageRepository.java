package com.example.Driller.repository;

import com.example.Driller.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MessageRepository extends JpaRepository<Message, Long> {
    Message findById(int Id);
}
