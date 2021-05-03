package com.PA.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trainee {
	@Id
	private int id;
	
	private String traineeId;
	private String gender;
	private String firstName;
	private String lastName;
	private String batch;
	private String phone;
	private String email;
	private String recruiter;
	
}
