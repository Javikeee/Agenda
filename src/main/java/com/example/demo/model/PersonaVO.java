package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonaVO {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String street;
	private Integer postalCode;
	private String city;
	private LocalDate birthday;

}
