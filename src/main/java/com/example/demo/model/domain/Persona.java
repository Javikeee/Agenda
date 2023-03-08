package com.example.demo.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Document("agenda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String street;
	private Integer postalCode;
	private String city;
	private LocalDate birthday;
}
