package com.example.dezdemoniyfirstlab.repositories;

import com.example.dezdemoniyfirstlab.models.Book;
import com.example.dezdemoniyfirstlab.models.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class UserRepository {
    @PersistenceContext(name = "postgres")
    private EntityManager em;

    public List<User> getAll() {
        return em.createQuery(
                        "select o from User o where o.isDeleted=false",
                        User.class)
                .getResultList();
    }

    public User getById(Long id) {
        return em.createQuery(
                        "select o from User o where o.isDeleted=false and o.id=:id",
                        User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public void  save(User user){
        em.persist(user);
        em.flush();
    }
}

