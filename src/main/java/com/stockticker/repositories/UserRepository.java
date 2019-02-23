package com.stockticker.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stockticker.documents.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
