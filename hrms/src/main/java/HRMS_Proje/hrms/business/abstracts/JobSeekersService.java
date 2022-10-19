package HRMS_Proje.hrms.business.abstracts;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.JobSeekers;


public interface JobSeekersService {
	List<JobSeekers> getAll();
	JobSeekers add(JobSeekers jobSeekers);
	JobSeekers getById(int id);
}
