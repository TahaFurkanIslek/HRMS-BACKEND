package HRMS_Proje.hrms.business.abstracts;
import java.util.List;

import HRMS_Proje.hrms.entities.concretes.Employer;


public interface EmployerService {
	List<Employer> getAll();
	Employer add(Employer employer);
}
