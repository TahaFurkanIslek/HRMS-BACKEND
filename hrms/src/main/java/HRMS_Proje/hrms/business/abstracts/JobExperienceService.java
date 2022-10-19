package HRMS_Proje.hrms.business.abstracts;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	List<JobExperience> getAll();
	List<JobExperience> getByCv_id(int id);
}
