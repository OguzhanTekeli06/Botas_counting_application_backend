package com.demo.authdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.authdemo.entity.Malzeme;

public interface MalzemeRepository extends JpaRepository<Malzeme, Integer> {
    Optional<Malzeme> findByBarkodNo(Integer barkod_no);
}