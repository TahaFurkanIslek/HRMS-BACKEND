package HRMS_Proje.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS_Proje.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	List<Language> getByCvId(int id);
}
