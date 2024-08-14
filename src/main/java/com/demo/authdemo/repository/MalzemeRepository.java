package com.demo.authdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.authdemo.entity.Malzeme;

public interface MalzemeRepository extends JpaRepository<Malzeme, Integer> {
    @Query(value = "select * from Malzemebul where id= :id", nativeQuery = true)
    List<Malzeme> getMalzemebulByBarkodNo(Integer id);

    public Object findByBarkodNo(Integer barkod_no);
}