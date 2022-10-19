package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.JobPositionService;
import HRMS_Proje.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_positions")
@CrossOrigin
public class JobPositionsController {
	private JobPositionService job_positionservice;

	@Autowired
	public JobPositionsController(JobPositionService job_positionservice) {
		super();
		this.job_positionservice = job_positionservice;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.job_positionservice.getAll();
	}
	
	@PostMapping("/add")
	public JobPosition add(@RequestBody JobPosition jobPosition) {
		return this.job_positionservice.add(jobPosition);
	}
}
