package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.CvService;
import HRMS_Proje.hrms.dataAccess.abstracts.CvDao;
import HRMS_Proje.hrms.dataAccess.abstracts.ImageDao;
import HRMS_Proje.hrms.dataAccess.abstracts.JobExperienceDao;
import HRMS_Proje.hrms.dataAccess.abstracts.LanguageDao;
import HRMS_Proje.hrms.entities.concretes.Cv;

import HRMS_Proje.hrms.entities.dtos.CvWithAllDetailsDto;
import HRMS_Proje.hrms.entities.dtos.CvWithJobExperienceDto;


@Service
public class CvManager implements CvService{
	private CvDao cvDao;
	private JobExperienceDao jobExperienceDao;
	private ImageDao imageDao;
	private LanguageDao languageDao;
	
	
	

	@Autowired
	public CvManager(CvDao cvDao, JobExperienceDao jobExperienceDao, ImageDao imageDao, LanguageDao languageDao) {
		super();
		this.cvDao = cvDao;
		this.jobExperienceDao = jobExperienceDao;
		this.imageDao = imageDao;
		this.languageDao = languageDao;
		
	}





	@Override
	public List<Cv> getAll() {
		return this.cvDao.findAll();
	}





	@Override
	public CvWithJobExperienceDto getCvWithExperienceDetails() {
		CvWithJobExperienceDto cvWithJobExperienceDto = new CvWithJobExperienceDto();
		cvWithJobExperienceDto.setCv(cvDao.findAll());
		cvWithJobExperienceDto.setJobExperiences(jobExperienceDao.findAll());
		return cvWithJobExperienceDto ;
	}



	

	@Override
	public CvWithAllDetailsDto getCvWithAllDetailsById(int id) {
		int cvId = this.cvDao.findByCvUserId(id).getId();
		CvWithAllDetailsDto cvWithAllDetailsDto = new CvWithAllDetailsDto();		
		//cvWithAllDetailsDto.setCv(this.cvDao.getById(id));
		cvWithAllDetailsDto.setCv(this.cvDao.findById(cvId).get());
		cvWithAllDetailsDto.setImage(imageDao.getByCvId(cvId));
		cvWithAllDetailsDto.setJobExperience(jobExperienceDao.getByCvId(cvId));
		cvWithAllDetailsDto.setLanguage(languageDao.getByCvId(cvId));
		return cvWithAllDetailsDto;
	}





	@Override
	public Cv add(Cv cv) {
		this.cvDao.save(cv);
		return null;
	}

	/*public CvWithAllDetailsDto getCvWithAllDetailsById(int id) {
		
		CvWithAllDetailsDto cvWithAllDetailsDto = new CvWithAllDetailsDto();		
		//cvWithAllDetailsDto.setCv(this.cvDao.getById(id));
		cvWithAllDetailsDto.setCv(this.cvDao.findById(id).get());
		cvWithAllDetailsDto.setImage(imageDao.getByCvId(id));
		cvWithAllDetailsDto.setJobExperience(jobExperienceDao.getByCvId(id));
		cvWithAllDetailsDto.setLanguage(languageDao.getByCvId(id));
		return cvWithAllDetailsDto;
	}*/

	
}
