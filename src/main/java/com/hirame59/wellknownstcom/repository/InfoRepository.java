package com.hirame59.wellknownstcom.repository;

import com.hirame59.wellknownstcom.domain.Info;

import java.util.List;


public interface InfoRepository {
    List<Info> findAll();

}
