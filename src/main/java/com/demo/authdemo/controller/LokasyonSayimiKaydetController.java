package com.demo.authdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authdemo.entity.LokasyonSayimiKaydet;
import com.demo.authdemo.service.LokasyonSayimiKaydetService;

@RestController
@RequestMapping("/api")
public class LokasyonSayimiKaydetController {

    @Autowired
    private LokasyonSayimiKaydetService lokasyonSayimiKaydetService;

    @PostMapping("/lokasyon-sayimi-kaydet")
    public ResponseEntity<LokasyonSayimiKaydet> addLokasyonSayimiKaydet(@RequestBody LokasyonSayimiKaydet lokasyonSayimiKaydet) {
        LokasyonSayimiKaydet newRecord = lokasyonSayimiKaydetService.save(lokasyonSayimiKaydet);
        return ResponseEntity.ok(newRecord);
    }

    @GetMapping("/lokasyon-sayimi-kaydet")
    public ResponseEntity<List<LokasyonSayimiKaydet>> getAllLokasyonSayimiKaydet() {
        List<LokasyonSayimiKaydet> records = lokasyonSayimiKaydetService.findAll();
        return ResponseEntity.ok(records);
    }
}
