package com.demo.authdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Malzeme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "barkod_no")
    private Integer barkodNo;
    @Column(name = "model")
    private String model;
    @Column(name = "marka")
    private String marka;
    @Column(name = "lokasyon")
    private String lokasyon;
    @Column(name = "oda")
    private Integer oda;

}
