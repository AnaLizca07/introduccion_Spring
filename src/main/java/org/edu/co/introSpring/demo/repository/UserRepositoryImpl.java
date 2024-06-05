package org.edu.co.introSpring.demo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.edu.co.introSpring.demo.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User byId(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> listUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void removeUser(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }
}
