package com.mustafa.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.hrms.business.abstracts.CvService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.core.results.SuccessDataResult;
import com.mustafa.hrms.dataAccess.abstracts.CvDao;
import com.mustafa.hrms.entites.Cv;

@Service
public class CvManager implements CvService {
	
	@Autowired
	private CvDao dao;

	@Override
	public Result add(Cv cv) {
		
		return new SuccessDataResult<Cv>(this.dao.save(cv));
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		
		return new SuccessDataResult<List<Cv>>(this.dao.findAll());
	}

	@Override
	public DataResult<Cv> findById(int id) {
		
		return new SuccessDataResult<Cv>(this.dao.findById(id));
	}

}
