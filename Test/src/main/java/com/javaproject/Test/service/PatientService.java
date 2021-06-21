package com.javaproject.Test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.Test.modal.Patient;
import com.javaproject.Test.repo.PatientRepo;


@Service
public class PatientService  {
	@Autowired
	PatientRepo patientRepo;
public Patient addPatient( Patient patient) {
	Patient savedPatient=patientRepo.save(patient);
	return savedPatient;
	
}
public List<Patient> getAllPatient() {
	List<Patient> allPatient=patientRepo.findAll();
	return allPatient;
	
}
public Patient getPatientById(int id) {
	 Patient patientById=patientRepo.findById(id).get();
	
	
	return patientById;
}
}
