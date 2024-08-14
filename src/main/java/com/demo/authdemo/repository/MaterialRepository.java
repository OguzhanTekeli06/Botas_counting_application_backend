package com.demo.authdemo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.authdemo.entity.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {

    @Query("SELECT COUNT(m) FROM Material m WHERE m.room.id = :id")
    int countMaterialsByRoomId(Long id);

    @Query("SELECT COUNT(m) FROM Material m WHERE m.room.id = :id AND m.bulduMu = true")
    int countFoundMaterialsByRoomId(Long id);

    @Query("SELECT COUNT(m) FROM Material m WHERE m.room.id != :id")
    int countMaterialsInOtherLocations(Long id);

    Optional<Material> findByBarkodNo(Long barkodNo);
}