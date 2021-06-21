package com.javaproject.Test.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.Test.modal.Doctor;
import com.javaproject.Test.repo.DoctorRepo;



@Service
public class DoctorService {

 @Autowired
	DoctorRepo doctorRepo;
public Doctor addDoctor (Doctor doctor) { 
	 Doctor savedDoctor = doctorRepo.save(doctor);
	 
	 return savedDoctor;
	 }
public List<Doctor> getAllDoctor() {
   List<Doctor> allDoctor =doctorRepo.findAll();

	return allDoctor;
}
public Doctor getDoctorById(int id) {
 Doctor doctorById=doctorRepo.findById(id).get();
return doctorById;
}
public void deleteDoctor(int id) {
	 doctorRepo.deleteById(id);

}
public Doctor updateDoctor(Doctor doctor) {
	 Doctor updateDoctor = doctorRepo.save(doctor);
	 return updateDoctor;
}
public Doctor updateDoctorById(Doctor doctor ,int id) {
	doctor.setId(id);
	 Doctor updateDoctor=doctorRepo.save(doctor);
	return updateDoctor;
}
public List<Doctor> getDoctorByName(String name) {
	List<Doctor> doctor= doctorRepo.findByName(name);
	return doctor;
}
}