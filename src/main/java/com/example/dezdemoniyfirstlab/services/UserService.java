package com.example.dezdemoniyfirstlab.services;


import com.example.dezdemoniyfirstlab.models.Book;
import com.example.dezdemoniyfirstlab.models.User;
import com.example.dezdemoniyfirstlab.repositories.BookRepository;
import com.example.dezdemoniyfirstlab.repositories.UserRepository;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class UserService {
    @EJB
    private UserRepository userRepository;

    public void save(User o) {
        userRepository.save(o);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User getById(Long id) {
        return userRepository.getById(id);
    }


}
