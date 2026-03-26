package com.Hackathon_1.hackproj.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Hackathon_1.hackproj.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
