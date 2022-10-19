package HRMS_Proje.hrms.api.controllers;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.CvService;
import HRMS_Proje.hrms.entities.concretes.Cv;
import HRMS_Proje.hrms.entities.dtos.CvWithAllDetailsDto;
import HRMS_Proje.hrms.entities.dtos.CvWithJobExperienceDto;


//import HRMS_Proje.hrms.entities.dtos.DenemeDto;

@RestController
@RequestMapping("/api/Cv")
@CrossOrigin
public class CvController{
	private CvService cvService;

	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getall")
	public List<Cv> getAll(){
		return this.cvService.getAll();
	}
	
	
	@GetMapping("/getCvWithExperienceDetails")
	public CvWithJobExperienceDto getCvWithExperienceDetails() {
		return this.cvService.getCvWithExperienceDetails();
	}
	
	@GetMapping("/getCvWithAllDetails")
	public CvWithAllDetailsDto getCvWithAllDetails(@RequestParam int id) {
		return this.cvService.getCvWithAllDetailsById(id);
		
	}
	@PostMapping("add")
	public Cv add(@RequestBody Cv cv) {
		return this.cvService.add(cv);
	}
	
	
	
	/*@GetMapping("/getDto")
	public DenemeDto getDto() {
		DenemeDto denemeDto = new DenemeDto();
		denemeDto.setYaziAlan("ali");
		denemeDto.setSayiAlan(10);
		List<Integer> sayiDizisi = new ArrayList<Integer>();
		sayiDizisi.add(1);
		sayiDizisi.add(2);
		denemeDto.setSayiArray(sayiDizisi);
		return denemeDto;
	}*/
	
	
}

