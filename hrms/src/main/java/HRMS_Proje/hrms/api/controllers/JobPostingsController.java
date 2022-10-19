package HRMS_Proje.hrms.api.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.JobPostingService;

import HRMS_Proje.hrms.entities.concretes.JobPosting;


@RestController
@RequestMapping("/api/job_postings")
@CrossOrigin
public class JobPostingsController {
	private JobPostingService job_postingservice;

	@Autowired
	public JobPostingsController(JobPostingService job_postingservice) {
		super();
		this.job_postingservice = job_postingservice;
	}
	
	@GetMapping("/getall")
	public List<JobPosting> getAll(){
		return this.job_postingservice.getAll();
	}
	
	@PostMapping("/add")
	public JobPosting add(@RequestBody JobPosting jobposting) {
		return this.job_postingservice.add(jobposting);
	}
	
	/*@GetMapping("/getBycompanyname")
	public List<JobPosting> getBycompanyname(@RequestParam String companyname){
		return this.job_postingservice.getByCompanyname(companyname);
	}*/
	@GetMapping("/getBylastapplicationdeadline")
	public List<JobPosting> getBylastapplicationdeadline(@RequestParam CharSequence lastapplicationdeadline){
		
		return  this.job_postingservice.getByLastapplicationdeadline(LocalDate.parse(lastapplicationdeadline));
	}
	@PostMapping("/delete")
	public JobPosting delete(@RequestParam int id) {
		return this.job_postingservice.deleteById(id);
	}
	
	@GetMapping("/OrderByLastapplicationdeadline")
	public List<JobPosting> OrderByLastapplicationdeadline(){
		return this.job_postingservice.OrderByLastapplicationdeadline();
	} 
	@GetMapping("/findByIsActiveOrderByLastapplicationdeadline")
	public List<JobPosting> findByActiveTrueOrderByLastapplicationdeadline(){
		return this.job_postingservice.findByActiveTrueOrderByLastapplicationdeadline();
	}
	@GetMapping("/findByIsActiveTrue")
	public List<JobPosting> findByIsActiveTrue(){
		return this.job_postingservice.findByActiveTrue();
	}
	@GetMapping("/getByEmployerId")
	public List<JobPosting> getByEmployerId(@RequestParam int id){
		return this.job_postingservice.findByEmployerId(id);
	}
	@GetMapping("/getByActiveTrueAndEmployerId")
	public List<JobPosting> findByActiveTrueAndEmployerId(@RequestParam int id) {
		return this.job_postingservice.findByActiveTrueAndEmployerId(id);
	}
}
