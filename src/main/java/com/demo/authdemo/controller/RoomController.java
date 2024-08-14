package com.demo.authdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authdemo.entity.Room;
import com.demo.authdemo.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/{subId}")
    public List<Room> getRoomsBySubId(@PathVariable Long subId) {
        return roomService.getRoomsBySubId(subId);
    }

    @PostMapping("/select")
    public ResponseEntity<String> selectRoom(@RequestBody Room room) {
        // Oda seçildiğinde yapılacak işlemleri burada belirleyebilirsiniz
        return ResponseEntity.ok("Room " + room.getOdaNum() + " selected");
    }
}