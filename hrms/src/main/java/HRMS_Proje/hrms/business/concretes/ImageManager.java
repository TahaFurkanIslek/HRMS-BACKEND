package HRMS_Proje.hrms.business.concretes;

import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;

import HRMS_Proje.hrms.business.abstracts.ImageService;
import HRMS_Proje.hrms.dataAccess.abstracts.ImageDao;
import HRMS_Proje.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public List<Image> getAll() {
		return this.imageDao.findAll();
	}

	@Override
	public Image getByCv_id(int id) {
		return this.imageDao.getByCvId(id);
	}

	/*@Override
	public Map update(MultipartFile multipartFile, int cvId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
