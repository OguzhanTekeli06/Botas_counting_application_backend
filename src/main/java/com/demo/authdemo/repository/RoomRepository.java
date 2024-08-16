package com.demo.authdemo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.authdemo.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> { // Long

    @Query("SELECT r FROM Room r WHERE r.subLocation.id = :subId")
    List<Room> findBySubId(Long subId);
}

