package com.hakmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hakmg.model.DoctorModel;

public interface DoctorRepository extends JpaRepository<DoctorModel,Integer>
	{

	}
