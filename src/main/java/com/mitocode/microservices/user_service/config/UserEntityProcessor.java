package com.mitocode.microservices.user_service.config;

import com.mitocode.microservices.user_service.model.entity.UserEntity;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserEntityProcessor implements RepresentationModelProcessor<EntityModel<UserEntity>> {

    @Override
    public EntityModel<UserEntity> process(EntityModel<UserEntity> model) {
        return EntityModel.of(model.getContent());
    }
}
