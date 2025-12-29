package com.mitocode.microservices.user_service.repository;

import com.mitocode.microservices.user_service.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path="user")
//public interface UserRepository extends CrudRepository<UserEntity, String> {
public interface UserRepository extends CrudRepository<UserEntity, String>,PagingAndSortingRepository<UserEntity, String> {

    @RestResource(path = "email")
    List<UserEntity> getAllByEmail(String email);

    @RestResource(path = "role")
    List<UserEntity> getAllByRoles(String role);

}
