package com.demo.authdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.authdemo.entity.Material;
import com.demo.authdemo.repository.MaterialRepository;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public int getTotalMaterialCount(Long id) {
        return materialRepository.countMaterialsByRoomId(id);
    }

    public int getFoundMaterialCount(Long id) {
        return materialRepository.countFoundMaterialsByRoomId(id);
    }

    public int getMaterialCountInOtherLocations(Long id) {
        return materialRepository.countMaterialsInOtherLocations(id);
    }

    public void updateMaterialStatus(Long barkodNo, boolean found) {
        Optional<Material> materialOpt = materialRepository.findByBarkodNo(barkodNo);
        if (materialOpt.isPresent()) {
            Material material = materialOpt.get();
            material.setBulduMu(found);
            materialRepository.save(material);
        } else {
            throw new RuntimeException("Material not found with barcode: " + barkodNo);
        }
    }
}