package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.JobExperienceService;
import HRMS_Proje.hrms.dataAccess.abstracts.JobExperienceDao;
import HRMS_Proje.hrms.entities.concretes.JobExperience;


@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}


	@Override
	public List<JobExperience> getAll() {
		return this.jobExperienceDao.findAll();
	}


	@Override
	public List<JobExperience> getByCv_id(int id) {
		return this.jobExperienceDao.getByCvId(id);
	}

}
