package com.demo.authdemo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Table(name="rooms")

public class Room {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private String odaNum;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "sub_id")
    private SubLocation subLocation;

    @OneToMany(mappedBy= "room", cascade= CascadeType.ALL,orphanRemoval= true, fetch=FetchType.LAZY)
    private Set<Material> materials = new HashSet<>();
    


}
