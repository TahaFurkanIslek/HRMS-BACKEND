package HRMS_Proje.hrms.business.abstracts;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.Cv;

import HRMS_Proje.hrms.entities.dtos.CvWithAllDetailsDto;
import HRMS_Proje.hrms.entities.dtos.CvWithJobExperienceDto;

public interface CvService {
	List<Cv> getAll();
	CvWithJobExperienceDto getCvWithExperienceDetails();
	CvWithAllDetailsDto getCvWithAllDetailsById(int id);
	Cv add(Cv cv);
}
