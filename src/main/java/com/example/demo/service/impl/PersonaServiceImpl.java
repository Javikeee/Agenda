package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PersonaVO;
import com.example.demo.model.domain.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.PersonaService;
import com.example.demo.util.AgendaMapper;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private AgendaMapper agendaMapper;

    public List<PersonaVO> getAllPersonas() {
        List<Persona> personaList = personaRepository.findAll();
        List<PersonaVO> voList = personaList.stream().map(agendaMapper::fromPropertyToVO).collect(Collectors.toList());
        return voList;
    }

    public PersonaVO getPersonaById(String id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return agendaMapper.fromPropertyToVO(persona);
    }

    public PersonaVO newPersona(Persona persona) {
        return agendaMapper.fromPropertyToVO(personaRepository.save(persona));
    }

    public PersonaVO updatePersona(String id, Persona persona) {

        if(personaRepository.existsById(id)) {
            return agendaMapper.fromPropertyToVO(personaRepository.save(persona));
        }else
            return null;
    }

    public void deletePersona(String id) {

        if (personaRepository.existsById(id)) {
            personaRepository.deleteById(id);
        }
    }

    public void deleteAllPersonas() {
        personaRepository.deleteAll();

    }

}
