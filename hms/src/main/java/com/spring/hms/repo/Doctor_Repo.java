package com.spring.hms.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.Doctor;
@Repository
public interface Doctor_Repo extends JpaRepository<Doctor, Integer> {

}
