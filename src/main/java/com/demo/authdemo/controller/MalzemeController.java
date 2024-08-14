package com.demo.authdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authdemo.entity.Malzeme;
import com.demo.authdemo.service.MalzemeService;

@RestController
@RequestMapping("/api/malzemeler")
public class MalzemeController {

    @Autowired
    private MalzemeService malzemeService;

    @GetMapping
    public ResponseEntity<List<Malzeme>> malzemeleriGetir() {
        List<Malzeme> malzemeler = malzemeService.malzemeleriGetir();
        return ResponseEntity.ok(malzemeler);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Malzeme> malzemeyiGetir(@PathVariable Integer id) {
        Optional<Malzeme> malzeme = malzemeService.malzemeyiIdIleGetir(id);
        return malzeme.map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }



}

