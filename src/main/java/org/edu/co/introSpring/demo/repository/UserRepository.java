package org.edu.co.introSpring.demo.repository;

import org.edu.co.introSpring.demo.domain.model.User;

import java.util.List;

public interface UserRepository {
    public User byId(Long id);
    public List<User> listUsers();
    public void removeUser(Long id);
    public void addUser(User user);
}
