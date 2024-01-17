package com.hirame59.wellknownstcom.repository;

import com.hirame59.wellknownstcom.domain.Book;
import jakarta.persistence.EntityManager;

import java.util.List;


public class JpaBookRepository implements BookRepository {
    private final EntityManager em;

    public JpaBookRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Book> findByName(String name) {

        return em.createQuery("select m from Book m where m.name = :name", Book.class)
                .setParameter("name", name)
                .getResultList();
    }

    @Override
    public List<Book> findByCid(String cid) {

        return em.createQuery("select m from Book m where m.cid = :cid", Book.class)
                .setParameter("cid", cid)
                .getResultList();
    }

    @Override
    public List<Book> findAll() {
        return em.createQuery("select m from Book m", Book.class)
                .getResultList();
    }
}
