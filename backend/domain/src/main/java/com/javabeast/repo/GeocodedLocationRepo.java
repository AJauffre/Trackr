package com.javabeast.repo;

import com.javabeast.TrackerMessage;
import com.javabeast.geocode.GeocodedLocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface GeocodedLocationRepo extends MongoRepository<GeocodedLocation, String> {

}
