package com.demo.authdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.authdemo.entity.Room;
import com.demo.authdemo.repository.RoomRepository;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getRoomsBySubId(Long subId) {
        return roomRepository.findBySubId(subId);
    }
}
