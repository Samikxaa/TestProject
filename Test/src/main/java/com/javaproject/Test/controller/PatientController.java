package com.javaproject.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.Test.modal.Patient;
import com.javaproject.Test.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	@Autowired
	PatientService patientService;
	@PostMapping("/add")
	public Patient addPatient(@RequestBody Patient patient) {
		Patient savedPatient= patientService.addPatient(patient);
		 
		return savedPatient;
	}
@GetMapping("/allPatient")	
public List<Patient> getAllPatient() {
	 List<Patient> patientList=patientService.getAllPatient();
	return patientList;
	
	
}
}
