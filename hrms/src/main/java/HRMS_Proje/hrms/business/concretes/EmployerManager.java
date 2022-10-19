package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.EmployerService;
import HRMS_Proje.hrms.dataAccess.abstracts.EmployerDao;
import HRMS_Proje.hrms.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerdao;
	
	
	
	@Autowired
	public EmployerManager(EmployerDao employerdao) {
		super();
		this.employerdao = employerdao;
		}

	@Override
	public List<Employer> getAll() {
		return this.employerdao.findAll();
		
	}

	@Override
	public Employer add(Employer employer) {		
		this.employerdao.save(employer);
		return null;
	}

}
