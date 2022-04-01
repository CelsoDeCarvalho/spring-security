package com.octodb.springsecurity;

import com.octodb.springsecurity.domain.Role;
import com.octodb.springsecurity.domain.User;
import com.octodb.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			//userService.saveRole(new Role("USER_ADMIN"));
			//userService.saveUser(new User("Celso Momade","celso","celso1999"));
			//userService.addRoleToUser("celso","USER_ADMIN");
		};
	}

}
