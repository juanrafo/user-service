package com.mitocode.microservices.user_service.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "user")
public class UserEntity {
    @Id
    private String id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private String lastname;
    private String username;
    private String password;
    private String[] roles;
}
