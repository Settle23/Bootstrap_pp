package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User findUserById(long id);

    List<User> getAllUsers();

    void updateUser(User updateUser, long id);

    void deleteUser(long id);

    User findByEmail(String email);
}
