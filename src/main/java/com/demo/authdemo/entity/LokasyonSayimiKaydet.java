package com.demo.authdemo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lokasyon_sayimi_kaydet") // Tablo adı burada düzeltildi
public class LokasyonSayimiKaydet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // id alanı otomatik olarak artırılacak

    private Long matId;  // malzeme ID'si
    private String locationName;  // lokasyon adı
    private Long roomId;  // oda ID'si
    private Long barkodNo;  // barkod numarası
    private String subName;  // alt lokasyon adı
    private LocalDateTime tarih;  // tarih
}
