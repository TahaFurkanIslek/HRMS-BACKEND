package HRMS_Proje.hrms.entities.dtos;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.Cv;
import HRMS_Proje.hrms.entities.concretes.Image;
import HRMS_Proje.hrms.entities.concretes.JobExperience;
import HRMS_Proje.hrms.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class CvWithAllDetailsDto {
	private Cv cv;
	private Image image;
	private List<JobExperience> jobExperience;
	private List<Language> language;
}
