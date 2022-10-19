package HRMS_Proje.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS_Proje.hrms.business.abstracts.JobSeekersService;

import HRMS_Proje.hrms.dataAccess.abstracts.JobSeekersDao;

import HRMS_Proje.hrms.entities.concretes.JobSeekers;


@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao job_seekersdao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao job_seekersdao) {
		super();
		this.job_seekersdao = job_seekersdao;
	}


	@Override
	public List<JobSeekers> getAll() {
		return this.job_seekersdao.findAll();
	}


	@Override
	public JobSeekers add(JobSeekers jobSeekers) {
		this.job_seekersdao.save(jobSeekers);
		return null;
	}


	@Override
	public JobSeekers getById(int id) {
		return this.job_seekersdao.getById(id);
	}

}
