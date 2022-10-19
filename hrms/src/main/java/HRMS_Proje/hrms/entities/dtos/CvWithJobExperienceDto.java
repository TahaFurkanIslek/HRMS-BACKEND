package HRMS_Proje.hrms.entities.dtos;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.Cv;
import HRMS_Proje.hrms.entities.concretes.JobExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class CvWithJobExperienceDto {
	private List<Cv> cv;
	private List<JobExperience> jobExperiences;
	
}
