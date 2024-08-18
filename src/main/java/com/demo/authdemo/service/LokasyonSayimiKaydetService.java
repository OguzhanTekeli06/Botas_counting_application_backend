package com.demo.authdemo.service;

import com.demo.authdemo.entity.LokasyonSayimiKaydet;
import com.demo.authdemo.repository.LokasyonSayimiKaydetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LokasyonSayimiKaydetService {

    @Autowired
    private LokasyonSayimiKaydetRepository lokasyonSayimiKaydetRepository;

    public LokasyonSayimiKaydet save(LokasyonSayimiKaydet lokasyonSayimiKaydet) {
        return lokasyonSayimiKaydetRepository.save(lokasyonSayimiKaydet);
    }

    public List<LokasyonSayimiKaydet> findAll() {
        return lokasyonSayimiKaydetRepository.findAll();
    }
}
