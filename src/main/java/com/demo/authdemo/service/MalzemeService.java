package com.demo.authdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.authdemo.entity.Malzeme;
import com.demo.authdemo.repository.MalzemeRepository;

@Service
public class MalzemeService {
    
    @Autowired
    private MalzemeRepository malzemeRepository;

    public List<Malzeme> malzemeleriGetir(){
        return malzemeRepository.findAll();
    }

    public Optional<Malzeme> malzemeyiIdIleGetir(Integer id) {
		System.out.println("ıd " + id);
        return malzemeRepository.findById(id);
    }
}

