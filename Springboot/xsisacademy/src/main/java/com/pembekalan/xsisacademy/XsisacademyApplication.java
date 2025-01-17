package com.pembekalan.xsisacademy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import com.pembekalan.xsisacademy.entity.*;
import com.pembekalan.xsisacademy.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.javafaker.Faker;

@SpringBootApplication
public class XsisacademyApplication {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	PublisherRepository publisherRepository;

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(XsisacademyApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			Category thriller = new Category("Thriller");
			Category novel = new Category("Novel");
			Category horror = new Category("Horror");
			// Category romance = new Category("Romance");

			categoryRepository.save(thriller);
			categoryRepository.save(novel);
			categoryRepository.save(horror);
			// categoryRepository.save(romance);

			Faker faker = new Faker(Locale.forLanguageTag("id-ID"));

			for (int i = 0; i < 10; i++) {
				User userSeed = new User(faker.name().fullName(), faker.phoneNumber().phoneNumber(), faker.address().fullAddress());
				userRepository.save(userSeed);
			}

			for (int i = 0; i < 10; i++) {
				Publisher publisherSeed = new Publisher(faker.book().publisher(), faker.address().fullAddress());
				publisherRepository.save(publisherSeed);
			}

			for (int i = 0; i < 10; i++) {
				Author authorSeed = new Author(faker.book().author(), faker.number().randomDigitNotZero());
				authorRepository.save(authorSeed);
			}

			Date startDate = java.sql.Date.valueOf("2000-01-01");
			Date endDate = java.sql.Date.valueOf("2025-01-01");

			Random random = new Random();

			for (int i = 0; i < 10; i++) {
				Category categorySeed = categoryRepository.findById(random.nextInt(3) + 1).orElse(null);
				Publisher publisherSeed = publisherRepository.findById(random.nextInt(10) + 1).orElse(null);
				Author authorSeed = authorRepository.findById(random.nextInt(10) + 1).orElse(null);

				Book bookSeed = new Book(
						categorySeed,
						publisherSeed,
						authorSeed,
						faker.book().title(),
						faker.weather().description(),
						faker.number().randomDigitNotZero(),
						faker.date().between(startDate, endDate));
				bookRepository.save(bookSeed);
			}
		};
	}

}
