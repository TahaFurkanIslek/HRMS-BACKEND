package HRMS_Proje.hrms.business.abstracts;
import java.util.List;

import HRMS_Proje.hrms.entities.concretes.JobPosition;


public interface JobPositionService {
		List<JobPosition> getAll();
		JobPosition add(JobPosition jobPosition); 
}
