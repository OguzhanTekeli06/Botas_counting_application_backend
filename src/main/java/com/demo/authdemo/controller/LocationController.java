package com.demo.authdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.authdemo.entity.Location;
import com.demo.authdemo.entity.SubLocation;
import com.demo.authdemo.service.LocationService;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/locations")
    public Location createLocation(@RequestBody Location location) {
        return locationService.createLocation(location);
    }

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/locations/sublocations/{locationId}")
    public List<SubLocation> getAllSubLocations(@PathVariable Long locationId) {
        return locationService.getAllSubLocations(locationId);
    }

    // Yeni endpoint: Kullanıcı adına göre location_id'yi döndür
    @GetMapping("/location/{username}")
    public Long getLocationIdByUsername(@PathVariable String username) {
        return locationService.getLocationIdByUsername(username);
    }
}
