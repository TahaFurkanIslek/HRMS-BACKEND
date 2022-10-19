package HRMS_Proje.hrms.business.concretes;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.UserService;
import HRMS_Proje.hrms.dataAccess.abstracts.UserDao;
import HRMS_Proje.hrms.entities.concretes.User;
import HRMS_Proje.hrms.entities.dtos.UserWithLoginDetailsDto;
//import HRMS_Proje.hrms.entities.dtos.UserWithLoginDetailsDto;



@Service
public class UserManager implements UserService{
	private UserDao userdao;
	
	
	@Autowired
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

		@Override
	public List<User> getAll() {
		
		return this.userdao.findAll();
		
	}

	@Override
	public User getUserWithLoginDetails(UserWithLoginDetailsDto userWithLoginDetailsDto) {
		User user = this.userdao.findByEPosta(userWithLoginDetailsDto.getEPosta());
		if(Objects.nonNull(user)) {
			if(user.getSifre().equals(userWithLoginDetailsDto.getSifre())) {
				return user;
			}else {
				return null;
			}
		}else {
			return null;
		}
		
	}

	@Override
	public User add(User user) {
		this.userdao.save(user);
		return null;
	}

}
