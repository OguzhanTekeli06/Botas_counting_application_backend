package com.demo.authdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authdemo.service.DatabaseRefreshService;

@RestController
public class RefreshDatabaseController {

    @Autowired
    private DatabaseRefreshService databaseRefreshService;

    @PostMapping("/api/refresh-database")
    public ResponseEntity<String> refreshDatabase() {
        databaseRefreshService.refreshDatabase();
        return new ResponseEntity<>("Veritabanı başarıyla yenilendi.", HttpStatus.OK);
    }
}