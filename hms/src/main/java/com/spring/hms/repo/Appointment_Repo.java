package com.spring.hms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.AppointMent;
@Repository
public interface Appointment_Repo extends JpaRepository<AppointMent, Integer> {

}
