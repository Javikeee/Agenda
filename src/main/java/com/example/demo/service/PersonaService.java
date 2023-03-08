package com.example.demo.service;

import com.example.demo.model.domain.Persona;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.PersonaVO;

import java.util.List;

public interface PersonaService {

	public List<PersonaVO> getAllPersonas();

	public PersonaVO getPersonaById(String id);

	public PersonaVO newPersona(Persona persona);

	public PersonaVO updatePersona(String id, Persona persona);

	public void deletePersona(String id);

	public void deleteAllPersonas();

}