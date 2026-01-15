package com.spring.hms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.Patient;
@Repository
public interface Patient_repo extends JpaRepository<Patient, Integer>{

}
