package org.pk.weather.earthquake;

import java.sql.Date;

import org.pk.weather.earthquake.data.Earthquake;
import org.pk.weather.earthquake.repository.EarthquakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EarthquakeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Date date = new Date(2017, 11, 12);
		repository.deleteAll();

		// save a couple of customers
		repository.save(new Earthquake(123, "120km NW Ireland", 3.0, 122.2, 233.4, date));
		repository.save(new Earthquake(124, "180km SW Ireland", 3.5, 142.2, 204.7, date));

		// fetch all customers
		System.out.println("Earthquake found with findAll():");
		System.out.println("-------------------------------");
		for (Earthquake earthquake : repository.findAll()) {
			System.out.println(earthquake);
		}
		System.out.println();

		// fetch an individual earthquake
		System.out.println("Earthquake found with findByDescription('120km NW Ireland'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByDescription("120km NW Ireland"));

		System.out.println("Earthquake found with findByMagnitude('3.5'):");
		System.out.println("--------------------------------");
		for (Earthquake earthquake : repository.findByMagnitude(3.5)){
			System.out.println(earthquake);
		}

	}

}