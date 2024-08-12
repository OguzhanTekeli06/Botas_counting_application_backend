package com.demo.authdemo.controller;


import com.demo.authdemo.entity.SubLocation;
import com.demo.authdemo.repository.SubLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sublocations")
public class SubLocationController {

    @Autowired
    private SubLocationRepository subLocationRepository;

    @GetMapping
    public List<SubLocation> getAllLocation() {
        return subLocationRepository.findAll();
    }
}
