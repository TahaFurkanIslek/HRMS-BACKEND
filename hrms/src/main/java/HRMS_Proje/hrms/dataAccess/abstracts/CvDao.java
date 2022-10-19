package HRMS_Proje.hrms.dataAccess.abstracts;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import HRMS_Proje.hrms.entities.concretes.Cv;
//import HRMS_Proje.hrms.entities.dtos.CvWithJobExperienceDto;

public interface CvDao extends JpaRepository<Cv, Integer>{
	Cv findByCvUserId(int id);
	
	
	
	/*@Query("Select new HRMS_Proje.hrms.entities.dtos.CvWithJobExperienceDto"
			+ "(c.id , c.github_account , c.linkedin_account , j.companyname ) "
			+ "From cv c Inner Join c.jobexperience j")
	List<CvWithJobExperienceDto> getCvWithExperienceDetails();*/
}
