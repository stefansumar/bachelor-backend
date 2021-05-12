package com.example.BachelorThesis.repository;

import com.example.BachelorThesis.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
