package HRMS_Proje.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.EmployerService;
import HRMS_Proje.hrms.entities.concretes.Employer;

import java.util.List;
@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
	private EmployerService employerservice;

	@Autowired
	public EmployersController(EmployerService employerservice) {
		super();
		this.employerservice = employerservice;
	}
	@GetMapping("/getall")
	public List<Employer> getAll(){
		return this.employerservice.getAll();
	}
	@PostMapping("/add")
	public Employer add(@RequestBody Employer employer) {
		return this.employerservice.add(employer);
	}
	
}
