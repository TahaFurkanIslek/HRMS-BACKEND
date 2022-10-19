package HRMS_Proje.hrms.business.abstracts;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.User;
import HRMS_Proje.hrms.entities.dtos.UserWithLoginDetailsDto;



public interface UserService {
		List<User> getAll();
		User getUserWithLoginDetails(UserWithLoginDetailsDto userWithLoginDetailsDto); 
		User add(User user);
}
