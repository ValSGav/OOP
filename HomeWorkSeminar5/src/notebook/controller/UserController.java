package HomeWorkSeminar5.src.notebook.controller;

import HomeWorkSeminar5.src.notebook.model.User;
import HomeWorkSeminar5.src.notebook.repository.GBRepository;

import java.util.List;

public class UserController {
    private final GBRepository<User, Long, String> repository;

    public UserController(GBRepository<User, Long, String> repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
        this.saveAllUsers();
    }

    public void saveAllUsers() {
        repository.saveAll();
    }

    public User readUser(Long userId) {
        return repository.findById(userId).get();
    }

    public List<User> readAllUser() {
        return repository.findAll();
    }

    public void update(Long currentId, User user) {
        user.setId(currentId);
        repository.update(currentId, user);
        this.saveAllUsers();
    }
}

