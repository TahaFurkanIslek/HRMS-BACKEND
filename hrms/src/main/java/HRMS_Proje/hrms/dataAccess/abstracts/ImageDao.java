package HRMS_Proje.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS_Proje.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer>{
	Image getByCvId(int id);
}
