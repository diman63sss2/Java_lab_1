package com.example.dezdemoniyfirstlab.services;

import com.example.dezdemoniyfirstlab.models.Book;
import com.example.dezdemoniyfirstlab.repositories.BookRepository;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class BookService {
    @EJB
    private BookRepository bookRepository;

    public void save(Book o) {
        bookRepository.save(o);
    }

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    public Book getById(Long id) {
        return bookRepository.getById(id);
    }


    public List<Book> getByUserId(Long id) {
        return bookRepository.getByUserId(id);
    }
}
