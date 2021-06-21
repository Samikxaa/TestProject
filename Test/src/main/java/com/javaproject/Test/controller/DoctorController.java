package com.javaproject.Test.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.Test.modal.Doctor;
import com.javaproject.Test.service.DoctorService;



@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		Doctor savedDoctor =doctorService.addDoctor(doctor);
		
		return savedDoctor;
	
	}
	
	

	@GetMapping("/allDoctor")
	public List<Doctor> getAllDoctor() {
		List<Doctor> doctorList=doctorService.getAllDoctor();
		
		return doctorList;
		
	}
	
	@GetMapping("/getDoctorById/{id}")
	public Doctor getDoctorById(@PathVariable int id) {
	Doctor doctorById =	doctorService.getDoctorById(id);
	return doctorById;	
		}
	
	@DeleteMapping("/deleteDoctor/{id}")
	public void deleteDoctor(@PathVariable int id) {
		 doctorService.deleteDoctor(id);
		
	}
	@PutMapping("/updateDoctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		Doctor updateDoctor= doctorService.updateDoctor(doctor);
		return updateDoctor;
		
	}
	@PutMapping("/updateDoctorById/{id}")
	public Doctor updateDoctorById(@RequestBody Doctor doctor,@PathVariable int id) {
		Doctor updateDoctor= doctorService.updateDoctorById(doctor,id);
		return updateDoctor;
	}
	@GetMapping("/getDoctorById/{name}")
	public List<Doctor> getDoctorByName(@PathVariable String name) {
	List<Doctor> doctorById =	doctorService.getDoctorByName(name);
	return doctorById;	
		}

}
