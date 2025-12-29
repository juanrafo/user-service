package com.mitocode.microservices.user_service;

import com.mitocode.microservices.user_service.model.entity.UserEntity;
import com.mitocode.microservices.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class UserServiceApplication  implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
/*        userRepository.deleteAll();

        userRepository.save(UserEntity.builder()
                        .email("user@mitocode.com")
                        .name("Mitocode")
                        .lastname("Microservices")
                        .username("mitocode")
                        .password("mitocode123")
                        .roles(new String[]{"ROLE_USER"})
                .build());


        userRepository.save(UserEntity.builder()
                .email("admin@mitocode.com")
                .name("Mitocode")
                .lastname("Microservices")
                .username("mitocode")
                .password("mitocode123")
                .roles(new String[]{"ROLE_ADMIN"})
                .build());*/
    }
}
