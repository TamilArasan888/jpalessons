package com.chainsys.jpa.application.doctor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
	
	Doctor findById(int id); 
	Doctor save(Doctor dr);
	// Used for adding a new doctor and existing doctor
	void deleteById(int dr_id);
	List <Doctor> findAll();
}
