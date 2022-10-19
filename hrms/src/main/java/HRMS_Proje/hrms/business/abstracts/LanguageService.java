package HRMS_Proje.hrms.business.abstracts;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	List<Language> getByCv_id(int id);
}
