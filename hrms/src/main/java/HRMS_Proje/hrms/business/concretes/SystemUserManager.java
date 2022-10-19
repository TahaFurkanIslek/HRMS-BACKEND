package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.SystemUserService;
import HRMS_Proje.hrms.dataAccess.abstracts.SystemUserDao;
import HRMS_Proje.hrms.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService{

	@Autowired
	private SystemUserDao systemUserDao;
	
	@Override
	public List<SystemUser> getAll() {
		return this.systemUserDao.findAll();
	}

	@Override
	public SystemUser add(SystemUser systemUser) {
		this.systemUserDao.save(systemUser);
		return null;
	}

}
