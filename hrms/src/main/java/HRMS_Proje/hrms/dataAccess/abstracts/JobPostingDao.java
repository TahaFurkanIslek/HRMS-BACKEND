package HRMS_Proje.hrms.dataAccess.abstracts;





import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMS_Proje.hrms.entities.concretes.JobPosting;


public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{
	
	//List<JobPosting> getByCompanyName(String companyname);
	List<JobPosting> getByLastapplicationdeadline(LocalDate lastapplicationdeadline);
	List<JobPosting> OrderByLastapplicationdeadline();
	List<JobPosting> findByActiveTrueOrderByLastapplicationdeadline();
	List<JobPosting> findByActiveTrue();
	List<JobPosting> findByEmployerId(int id);
	List<JobPosting> findByActiveTrueAndEmployerId(int id);
}
