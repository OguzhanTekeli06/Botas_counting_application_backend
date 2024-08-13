package com.demo.authdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.authdemo.entity.Malzeme;
import com.demo.authdemo.repository.MalzemeRepository;

@Service
public class MalzemeService {
    
    @Autowired
    private MalzemeRepository malzemeRepository;

    public Malzeme getMalzemeByBarkodNo(Integer barkod_no) {
        return malzemeRepository.findByBarkodNo(barkod_no).orElse(null);
    }
}

