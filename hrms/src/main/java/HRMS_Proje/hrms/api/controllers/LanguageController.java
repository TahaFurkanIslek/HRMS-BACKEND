package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.LanguageService;
import HRMS_Proje.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/Language")
public class LanguageController {
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return this.languageService.getAll();
	}
	
	

}
