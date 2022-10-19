package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.ImageService;
import HRMS_Proje.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/Image")
public class ImageController {
	
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping("/getall")
	public List<Image> getAll(){
		return this.imageService.getAll();
	}
	
	
}
