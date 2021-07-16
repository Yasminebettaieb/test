package com.devn8.app;

import com.devn8.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.devn8.app.repository.UserRepository;

@SpringBootApplication
public class AppApplication{

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}



}
