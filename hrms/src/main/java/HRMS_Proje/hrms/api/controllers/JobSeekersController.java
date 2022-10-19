package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.JobSeekersService;
import HRMS_Proje.hrms.entities.concretes.JobSeekers;


@RestController
@RequestMapping("/api/job_seekers")
@CrossOrigin
public class JobSeekersController {
	private JobSeekersService job_seekersservice;

	@Autowired
	public JobSeekersController(JobSeekersService job_seekersservice) {
		super();
		this.job_seekersservice = job_seekersservice;
	}
	
	@GetMapping("/getall")
	public List<JobSeekers> getAll(){
		return this.job_seekersservice.getAll();
	}
	
	@PostMapping("/add")
	public JobSeekers add(@RequestBody JobSeekers jobSeekers) {
		return this.job_seekersservice.add(jobSeekers);
	}
	
	@GetMapping("/getById")
	public JobSeekers getById(@RequestParam int id){
		return this.job_seekersservice.getById(id);
	}
	
	
}
