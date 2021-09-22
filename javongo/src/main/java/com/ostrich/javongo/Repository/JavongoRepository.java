package com.ostrich.javongo.Repository;

import com.ostrich.javongo.Entities.Javongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JavongoRepository extends MongoRepository<Javongo, String> {

}
