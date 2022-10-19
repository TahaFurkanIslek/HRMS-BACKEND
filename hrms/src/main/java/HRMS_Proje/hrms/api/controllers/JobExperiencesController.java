package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.JobExperienceService;
import HRMS_Proje.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/JobExperience")
public class JobExperiencesController {
	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("/getall")
	public List<JobExperience> getAll(){
		return this.jobExperienceService.getAll();
	}
}
