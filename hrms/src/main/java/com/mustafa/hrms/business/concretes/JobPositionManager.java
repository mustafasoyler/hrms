package com.mustafa.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.hrms.business.abstracts.JobPositionService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.ErrorDataResult;
import com.mustafa.hrms.core.results.ErrorResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.core.results.SuccessDataResult;
import com.mustafa.hrms.core.results.SuccessResult;
import com.mustafa.hrms.dataAccess.abstracts.JobPositionDao;
import com.mustafa.hrms.entites.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public JobPosition getByPositionName(String positionName) {
		return this.jobPositionDao.findByPositionName(positionName);
	}

	@Override
	public Result addNew(JobPosition jobPosition) {
		if(jobPosition.getPositionName() == null || jobPosition.getPositionName() == "")
			return new ErrorResult("İş pozisyon ismi boş bırakılamaz.");
		if(getByPositionName(jobPosition.getPositionName()) != null)
			return new ErrorResult("Aynı isimde iki adet iş pozisyonu oluşturulamaz.");
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu başarıyla eklendi.");
	}

	@Override
	public DataResult<JobPosition> getById(int id) {
		JobPosition jobPosition = jobPositionDao.findById(id);
		if(jobPosition==null) return new ErrorDataResult<JobPosition>();
	    return new SuccessDataResult<JobPosition>(jobPosition);
	}
	
	

}