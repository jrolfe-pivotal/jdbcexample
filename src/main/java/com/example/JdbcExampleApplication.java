package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcExampleApplication {
	
	private static final String TEST_QUERY="SHOW TABLES;";

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcExampleApplication.class, args);
	}
	
	@PostConstruct
	public void testConnection() {
		System.out.println("=======================================");
		System.out.println(jdbcTemplate.queryForList(TEST_QUERY));
		System.out.println("=======================================");
	}
}
