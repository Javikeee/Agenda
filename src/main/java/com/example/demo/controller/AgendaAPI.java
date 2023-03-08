package com.example.demo.controller;

import com.example.demo.model.domain.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.PersonaVO;


public interface AgendaAPI {

	//	GET
	
    @GetMapping("/personas")
    public ResponseEntity<?> getAllPersonas();

    @GetMapping("/personas/{id}")
    public ResponseEntity<?> getPersonaById(@PathVariable String id);
    
    //	POST
    
    @PostMapping("/personas")
    public ResponseEntity<?> newPersona(@RequestBody Persona persona);
    
    //	PUT
    
    @PutMapping("/personas/{id}")
    public ResponseEntity<?> updatePersona(@PathVariable String id, @RequestBody Persona persona);
        
    //	DELETE
        
    @DeleteMapping("/personas/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable String id);
    
    @DeleteMapping("/personas/all")
    public ResponseEntity<?> deleteAllPersonas();
	
}
