package com.productservice.userservice;

import com.productservice.userservice.dtos.LoginRequestDto;
import com.productservice.userservice.dtos.SignUpRequestDto;
import com.productservice.userservice.dtos.UserDto;
import com.productservice.userservice.services.AuthService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}





}
