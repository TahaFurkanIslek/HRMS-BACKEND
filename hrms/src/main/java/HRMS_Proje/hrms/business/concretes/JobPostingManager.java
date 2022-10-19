package HRMS_Proje.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.JobPostingService;
import HRMS_Proje.hrms.dataAccess.abstracts.JobPostingDao;
import HRMS_Proje.hrms.entities.concretes.JobPosting;



@Service
public class JobPostingManager implements JobPostingService{

	private JobPostingDao job_postingdao;
	
	@Autowired
	public JobPostingManager(JobPostingDao job_postingdao) {
		super();
		this.job_postingdao = job_postingdao;
	}


	@Override
	public List<JobPosting> getAll() {
		
		return this.job_postingdao.findAll();
	}


	@Override
	public JobPosting add(JobPosting jobposting) {
		this.job_postingdao.save(jobposting);
		return null;
		
	}


	/*@Override
	public List<JobPosting> getByCompanyname(String companyname) {
		
		return this.job_postingdao.getByCompanyName(companyname);
	}*/


	@Override
	public List<JobPosting> getByLastapplicationdeadline(LocalDate lastapplicationdeadline) {
	
		return this.job_postingdao.getByLastapplicationdeadline(lastapplicationdeadline);
	}


	@Override
	public JobPosting deleteById(int id) {
		this.job_postingdao.deleteById(id); 
		return null;
	}


	@Override
	public List<JobPosting> OrderByLastapplicationdeadline() {
		return this.job_postingdao.OrderByLastapplicationdeadline();
	}


	@Override
	public List<JobPosting> findByActiveTrueOrderByLastapplicationdeadline() {
		return this.job_postingdao.findByActiveTrueOrderByLastapplicationdeadline();
	}


	@Override
	public List<JobPosting> findByActiveTrue() {
		return this.job_postingdao.findByActiveTrue();

	}


	@Override
	public List<JobPosting> findByEmployerId(int id) {
		return this.job_postingdao.findByEmployerId(id);
	}


	@Override
	public List<JobPosting> findByActiveTrueAndEmployerId(int id) {
		return this.job_postingdao.findByActiveTrueAndEmployerId(id);
	}


	


	
	

}
