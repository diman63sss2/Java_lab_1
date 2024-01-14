package com.example.dezdemoniyfirstlab.repositories;


import com.example.dezdemoniyfirstlab.models.Book;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Stateless
public class BookRepository {

    @PersistenceContext(name = "postgres")
    private EntityManager em;

    public List<Book> getAll() {
        return em.createQuery(
                        "select o from Book o where o.isDeleted=false",
                        Book.class)
                .getResultList();
    }

    public Book getById(Long id) {
        return em.createQuery(
                        "select o from Book o where o.isDeleted=false and o.id=:id",
                        Book.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public void  save(Book book){
        em.persist(book);
        em.flush();
    }

    public List<Book> getByUserId(Long id) {
        return em.createQuery("SELECT b FROM Book b JOIN b.user u WHERE b.isDeleted = false AND u.id = :id", Book.class)
                .setParameter("id", id)
                .getResultList();

    }
}
