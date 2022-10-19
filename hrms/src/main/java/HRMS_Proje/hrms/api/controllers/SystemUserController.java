package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.SystemUserService;

import HRMS_Proje.hrms.entities.concretes.SystemUser;

@RestController
@RequestMapping("/api/systemusers")
@CrossOrigin
public class SystemUserController {
	@Autowired
	private SystemUserService systemUserService;
	
	@GetMapping("/getall")
	public List<SystemUser> getAll(){
		return this.systemUserService.getAll();
	}
	@PostMapping("/add")
	public SystemUser add(@RequestBody SystemUser systemUser) {
		return this.systemUserService.add(systemUser);
	}
	
}
