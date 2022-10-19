package HRMS_Proje.hrms.business.abstracts;

import java.util.List;

import HRMS_Proje.hrms.entities.concretes.SystemUser;



public interface SystemUserService {
	List<SystemUser> getAll();
	SystemUser add(SystemUser systemUser);
}
