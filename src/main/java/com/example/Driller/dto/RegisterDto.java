package com.example.Driller.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterDto {
    private String username;
    private String emailAdress;
    private String password;
}