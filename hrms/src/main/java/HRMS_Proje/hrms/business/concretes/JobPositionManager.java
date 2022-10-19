package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.JobPositionService;

import HRMS_Proje.hrms.dataAccess.abstracts.JobPositionDao;
import HRMS_Proje.hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao job_positiondao;
	
	@Autowired
	public JobPositionManager(JobPositionDao job_positiondao) {
		super();
		this.job_positiondao = job_positiondao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return this.job_positiondao.findAll();
	}

	@Override
	public JobPosition add(JobPosition jobPosition) {
		this.job_positiondao.save(jobPosition);
		return null;
	}
	
}
