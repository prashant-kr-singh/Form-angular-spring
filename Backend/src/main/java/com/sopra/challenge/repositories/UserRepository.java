package com.sopra.challenge.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sopra.challenge.models.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
