package HRMS_Proje.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import HRMS_Proje.hrms.entities.concretes.JobPosting;




public interface JobPostingService {
	List<JobPosting> getAll();
	JobPosting add(JobPosting jobposting);
	//List<JobPosting> getByCompanyname(String companyname);
	List<JobPosting> getByLastapplicationdeadline(LocalDate lastapplicationdeadline);
	JobPosting deleteById(int id);
	List<JobPosting> OrderByLastapplicationdeadline();
	List<JobPosting> findByActiveTrueOrderByLastapplicationdeadline();
	List<JobPosting> findByActiveTrue();
	List<JobPosting> findByEmployerId(int id);
	List<JobPosting> findByActiveTrueAndEmployerId(int id);
	
}
