package com.demo.authdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="materials")

public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matId;

    private Long barkodNo;

    private Boolean bulduMu = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")  // Room tablosundaki id ile ilişkili
    private Room room;

    // Yeni Alanlar
    private String model;
    private String marka;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "per_id", referencedColumnName = "per_id")
    private Personel personel;  // Yeni ilişki
}
