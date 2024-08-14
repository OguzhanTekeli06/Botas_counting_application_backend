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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     
    private Long matId;

    private Long barkodNo;

    private Boolean bulduMu = false;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="id")   // Bu, Room tablosundaki id ile ilişkili
    private Room room;
}
