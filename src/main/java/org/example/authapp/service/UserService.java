package org.example.authapp.service;

import org.example.authapp.model.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(String username, String password);
    User getUserById(Long id);
    User updateUser(User user);
    void deleteUser(Long id);
}
