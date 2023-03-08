package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.domain.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {
	
}
