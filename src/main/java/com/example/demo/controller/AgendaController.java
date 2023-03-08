package com.example.demo.controller;

import com.example.demo.model.domain.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.impl.PersonaServiceImpl;
import com.example.demo.util.AgendaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PersonaVO;
import com.example.demo.service.PersonaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class AgendaController implements AgendaAPI {

    @Autowired
    private PersonaServiceImpl personaService;

    public ResponseEntity<?> getAllPersonas() {
        List<PersonaVO> personaVOList = personaService.getAllPersonas();
        return ResponseEntity.ok(personaVOList);
    }

    public ResponseEntity<?> getPersonaById(String id) {
        PersonaVO personaVO = personaService.getPersonaById(id);
        return ResponseEntity.ok(personaVO);
    }

    public ResponseEntity<?> newPersona(@RequestBody Persona persona) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personaService.newPersona(persona));
    }

    public ResponseEntity<?> updatePersona(String id, Persona persona) {

        if (persona == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(personaService.updatePersona(id, persona));
        }
    }

    public ResponseEntity<?> deletePersona(String id) {
        if (personaService.getPersonaById(id) != null) {
            personaService.deletePersona(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<?> deleteAllPersonas() {
        personaService.deleteAllPersonas();
        return ResponseEntity.noContent().build();
    }

}
