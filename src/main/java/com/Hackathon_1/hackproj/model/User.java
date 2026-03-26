package com.Hackathon_1.hackproj.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // avoid reserved names if needed
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // getters and setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}
