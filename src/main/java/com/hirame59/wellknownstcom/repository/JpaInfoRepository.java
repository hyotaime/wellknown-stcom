package com.hirame59.wellknownstcom.repository;

import com.hirame59.wellknownstcom.domain.Info;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaInfoRepository implements InfoRepository {
    private final EntityManager em;

    public JpaInfoRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Info> findAll() {
        return em.createQuery("select i from Info i", Info.class)
                .getResultList();
    }
}
