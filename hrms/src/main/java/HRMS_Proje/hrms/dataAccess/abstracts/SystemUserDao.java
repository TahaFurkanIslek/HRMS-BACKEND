package HRMS_Proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS_Proje.hrms.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer>{

}
