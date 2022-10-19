package HRMS_Proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS_Proje.hrms.entities.concretes.JobSeekers;



public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer>{
	
}
