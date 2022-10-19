package HRMS_Proje.hrms.business.abstracts;


import java.util.List;
//import java.util.Map;

//import org.springframework.web.multipart.MultipartFile;

import HRMS_Proje.hrms.entities.concretes.Image;

public interface ImageService {
	List<Image> getAll();
	Image getByCv_id(int id);
	//Map update(MultipartFile multipartFile,int cvId);
    //Map delete(int id);
}
