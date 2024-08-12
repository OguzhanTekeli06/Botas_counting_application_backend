package com.demo.authdemo.service;

import com.demo.authdemo.entity.Location;
import com.demo.authdemo.entity.SubLocation;
import com.demo.authdemo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll(); // This should now include sub-locations if properly fetched
    }

    public List<SubLocation> getAllSubLocations(Long locationId) {
        return locationRepository.getAllSubLocationByLocationId(locationId);
    }
}
