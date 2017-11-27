package org.pk.weather.earthquake.repository;

import java.util.List;

import org.pk.weather.earthquake.data.Earthquake;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EarthquakeRepository extends MongoRepository<Earthquake, Integer> {

    public Earthquake findByDescription(String description);
    public List<Earthquake> findByMagnitude(Double d);

}
