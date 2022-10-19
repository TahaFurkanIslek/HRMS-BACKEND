package HRMS_Proje.hrms.core.services;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.*;
//import com.cloudinary.utils.ObjectUtils;

@Service
public class CloudinaryService {
	
	Cloudinary cloudinary;
	private Map<String,String> valuesMap=new HashMap<>();
	
	public CloudinaryService(){
		 	valuesMap.put("cloud_name","taha2000");
	        valuesMap.put("api_key", "451696263786813");
	        valuesMap.put("api_secret","vJzZgEtoOn21oNA2kU4peP5c1Ag");
	        cloudinary=new Cloudinary(valuesMap);
		
	
	}
	 
	/*public Map upload(MultipartFile multipartFile) throws IOException{
	        File file= convert(multipartFile);
	        Map result=cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	        file.delete();
	        return result;
	    }*/
	
	
	public File convert(MultipartFile multipartFile) throws IOException {
	        File file=new File(multipartFile.getOriginalFilename());
	        FileOutputStream stream=new FileOutputStream(file);
	        stream.write(multipartFile.getBytes());
	        stream.close();
	        return file;
	    }
	
	 
	 /*public Map delete(String id) throws IOException{
	        Map result= cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
	        return result;
	    }*/
	 
	 
	 
	 /*Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
			"cloud_name", "taha2000",
			"api_key", "451696263786813",
			"api_secret", "vJzZgEtoOn21oNA2kU4peP5c1Ag",
			"secure", true));*/
}
