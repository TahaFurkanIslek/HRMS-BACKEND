package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.LanguageService;
import HRMS_Proje.hrms.dataAccess.abstracts.LanguageDao;
import HRMS_Proje.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}


	@Override
	public List<Language> getAll() {
		return this.languageDao.findAll();
	}


	@Override
	public List<Language> getByCv_id(int id) {
		return this.languageDao.getByCvId(id);
	}

}
