package HRMS_Proje.hrms.dataAccess.abstracts;





import org.springframework.data.jpa.repository.JpaRepository;

import HRMS_Proje.hrms.entities.concretes.User;






public interface UserDao extends JpaRepository<User,Integer>{
	User findByEPosta(String eposta);
}
