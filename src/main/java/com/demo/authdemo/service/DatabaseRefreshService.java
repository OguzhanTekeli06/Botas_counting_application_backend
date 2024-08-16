package com.demo.authdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.authdemo.repository.LocationRepository;
import com.demo.authdemo.repository.MaterialRepository;
import com.demo.authdemo.repository.PersonelRepository;
import com.demo.authdemo.repository.RoomRepository;
import com.demo.authdemo.repository.SubLocationRepository;
import com.demo.authdemo.repository.UserRepository;

@Service
public class DatabaseRefreshService {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private PersonelRepository personelRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private SubLocationRepository subLocationRepository;

    @Autowired
    private UserRepository userRepository;

    public void refreshDatabase() {
        // Burada tabloları tekrar sorgulayabilir veya belirli bir işlemi tetikleyebilirsiniz
        locationRepository.findAll();
        materialRepository.findAll();
        personelRepository.findAll();
        roomRepository.findAll();
        subLocationRepository.findAll();
        userRepository.findAll();
        
        // Gerekirse verileri tekrar yükleyebilir veya güncelleyebilirsiniz
    }
}