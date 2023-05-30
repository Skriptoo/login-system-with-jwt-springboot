package com.example.Driller.repository;


import com.example.Driller.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<AppUser, Long> {
    AppUser findUserByemailAdress(String emailAdress);
    Optional<AppUser> findUserByusername(String username);
    Boolean existsByUsername(String username);
    AppUser findById(int id);
}
