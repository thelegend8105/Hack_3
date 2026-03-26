package com.Hackathon_1.hackproj.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import java.util.List;
import com.Hackathon_1.hackproj.model.User;
import com.Hackathon_1.hackproj.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class TestController {

    private final UserRepository repo;

    @Autowired
    public TestController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public User addUser(@RequestBody @NonNull User user) {
        return repo.save(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable @NonNull Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
