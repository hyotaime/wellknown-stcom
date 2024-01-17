package com.hirame59.wellknownstcom.repository;


import com.hirame59.wellknownstcom.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpringDataJpaInfoRepository extends JpaRepository<Info, String>, InfoRepository {
}
