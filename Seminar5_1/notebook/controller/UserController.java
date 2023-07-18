package Seminar5_1.notebook.controller;

import Seminar5_1.notebook.model.User;
import Seminar5_1.notebook.repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository<User, Long> repository;

    public UserController(GBRepository<User, Long> repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }
}
