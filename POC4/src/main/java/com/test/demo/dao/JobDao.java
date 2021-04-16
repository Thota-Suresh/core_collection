package com.test.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.model.Job;

//availability


@Repository
public interface JobDao   extends JpaRepository<Job, Integer> {

	 List<Job> findByExperiance(int experiance);
	 List<Job> findByJobType(String jobType);
	 List<Job> findByAvailability(String availability);
	 List<Job> findByCountry(String country);
	 List<Job> findBySkills(String  skills);
	 List<Job> findByLanguage(String  language);
	
}
