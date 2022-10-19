package HRMS_Proje.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS_Proje.hrms.business.abstracts.UserService;
import HRMS_Proje.hrms.entities.concretes.User;
//import HRMS_Proje.hrms.entities.dtos.UserWithLoginDetailsDto;
import HRMS_Proje.hrms.entities.dtos.UserWithLoginDetailsDto;



@RestController
@RequestMapping("/api/users")
public class UsersController {
		
		@Autowired
		private UserService userservice;
		public UsersController(UserService userservice) {
			super();
			this.userservice = userservice;
		}
		
		

		@GetMapping("/getall")
		public List<User> getAll(){
			return this.userservice.getAll();
			
		}
		
		@GetMapping("/getUserWithLoginDetails")
		public User getUserWithLoginDetails(UserWithLoginDetailsDto userWithLoginDetailsDto) {
			return this.userservice.getUserWithLoginDetails(userWithLoginDetailsDto);
		}
		
		@PostMapping("/add")
		public User add(@RequestBody User user) {
			return this.userservice.add(user);
		}
}
