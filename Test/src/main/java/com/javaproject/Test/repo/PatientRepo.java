package com.javaproject.Test.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.javaproject.Test.modal.Patient;


public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
