package com.javaproject.Test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.Test.modal.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor,Integer >{
	

	List<Doctor> findByName(String name);

}
