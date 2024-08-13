package com.demo.authdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authdemo.entity.Malzeme;
import com.demo.authdemo.service.MalzemeService;

@RestController
@RequestMapping("/api")
public class MalzemeController {

    @Autowired
    private MalzemeService malzemeService;

    @GetMapping("/malzeme/{barkod_no}")
    public ResponseEntity<Malzeme> getMalzemeByBarkodNo(@PathVariable Integer barkod_no) {
        Malzeme malzeme = malzemeService.getMalzemeByBarkodNo(barkod_no);
        if (malzeme != null) {
            return ResponseEntity.ok(malzeme);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

