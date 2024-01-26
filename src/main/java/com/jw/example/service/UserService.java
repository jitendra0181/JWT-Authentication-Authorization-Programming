package com.jw.example.service;

import com.jw.example.models.User;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Getter
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Jitendra Yadav", "jitu@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Sikendra Yadav", "siku@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mukesh kumar", "mukesh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Dinesh kumar", "dinesh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Akash Kumar", "akash@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
