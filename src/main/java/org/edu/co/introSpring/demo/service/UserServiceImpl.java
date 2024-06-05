package org.edu.co.introSpring.demo.service;

import org.edu.co.introSpring.demo.domain.model.User;
import org.edu.co.introSpring.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;
    @Override
    public User byId(Long id) {
        return repository.byId(id);
    }

    @Override
    public List<User> listUsers() {
        return repository.listUsers();
    }

    @Override
    public void removeUser(Long id) {
        repository.removeUser(id);
    }

    @Override
    public void addUser(User user) {
        repository.addUser(user);
    }
}
