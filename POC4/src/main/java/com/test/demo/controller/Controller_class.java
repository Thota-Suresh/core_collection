package com.test.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dao.JobDao;
import com.test.demo.dao.UserDao;
import com.test.demo.model.Job;
import com.test.demo.model.User;

@RestController
public class Controller_class {

	@Autowired
	private JobDao jdao;
	@Autowired
	private UserDao dao;
	
	
	@GetMapping("/job/country/{country}")
	public List<Job> getDataCountry(@PathVariable("country") String country){
		return jdao.findByCountry(country);
	}
	@GetMapping("/job/language/{language}")
	public List<Job> getlanguage(@PathVariable("language") String language){
		return jdao.findByLanguage(language);
	}
	@GetMapping("/job/{payRate}/{payRate1}")
	public List<Job> getpayRate(@PathVariable("payRate") Integer payRate,@PathVariable("payRate1")  Integer payRate1){
		return jdao.findByPayRate(payRate, payRate1);
	}
	
	@GetMapping("/job/skills/{skills}")
	public List<Job> getskills(@PathVariable("skills") String  skills){
		return jdao.findBySkills(skills);
	}
	
	@GetMapping("/job/expre/{expre}")
	public List<Job> getExperince(@PathVariable("expre") Integer job_ex) {
		return jdao.findByExperiance(job_ex);
	}
	@GetMapping("/job/jobType/{jobType}")
	public List<Job> getjobType(@PathVariable("jobType") String jobType){
		return jdao.findByJobType(jobType);
	}
	
	@GetMapping("job/avaliable/{ava}")
	public List<Job> getAvaliable(@PathVariable("ava") String availability){
		return jdao.findByAvailability(availability);
	}
	
	@PostMapping("/create/job")
	public Job createJob(@RequestBody Job job_id) {
		return jdao.save(job_id);
	}
	@PostMapping("/create/user")
	public User createuser(@RequestBody User user_id) {
		return dao.save(user_id);
	}
	@GetMapping("job/{id}")
	public Optional<Job> getDataJob(@PathVariable("id") int job_id) {
		return jdao.findById(job_id);
	}
	@GetMapping("user/{id}")
	public Optional<User> getUser(@PathVariable("id") int user_id){
		return dao.findById(user_id);
	}
}
