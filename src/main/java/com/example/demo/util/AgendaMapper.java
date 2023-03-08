package com.example.demo.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.model.PersonaVO;
import com.example.demo.model.domain.Persona;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AgendaMapper {

    private final ModelMapper modelMapper;
    
    public PersonaVO fromPropertyToVO(Persona Persona){
        return modelMapper.map(Persona, PersonaVO.class);
    }

    public Persona fromVOToProperty(PersonaVO personaVO){
        return modelMapper.map(personaVO, Persona.class);
    }

}
