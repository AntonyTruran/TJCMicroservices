package com.qa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.demo.entities.Account;

@Repository
public interface MongoAccountRepo extends MongoRepository<Account, Long>{
}
