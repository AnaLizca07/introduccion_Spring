package org.edu.co.introSpring.demo.service;

import org.edu.co.introSpring.demo.domain.model.User;

import java.util.List;

public interface UserService {
     User byId(Long id);
     List<User> listUsers();
     void removeUser(Long id);
     void addUser(User user);
}
