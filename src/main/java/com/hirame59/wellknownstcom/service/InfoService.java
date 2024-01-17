package com.hirame59.wellknownstcom.service;

import com.hirame59.wellknownstcom.domain.Info;
import com.hirame59.wellknownstcom.repository.InfoRepository;

import java.util.List;

public class InfoService {
    private final InfoRepository infoRepository;
    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public List<Info> findInfo() {
        return infoRepository.findAll();
    }

}
