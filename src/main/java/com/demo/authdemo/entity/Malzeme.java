package com.demo.authdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Data
@Table(name="Malzemebul",uniqueConstraints = @UniqueConstraint(columnNames = "barkod_no"))
public class Malzeme {
    @Id
    @Column(name = "barkod_no", nullable = false)
    private Integer barkodNo;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "model")
    private String model;

    @Column(name = "marka")
    private String marka;

    @Column(name = "lokasyon")
    private String lokasyon;

    @Column(name = "oda")
    private Integer oda;
    

}
