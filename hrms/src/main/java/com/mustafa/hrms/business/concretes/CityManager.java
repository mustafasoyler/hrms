package com.mustafa.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.hrms.business.abstracts.CityService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.ErrorDataResult;
import com.mustafa.hrms.core.results.SuccessDataResult;
import com.mustafa.hrms.dataAccess.abstracts.CityDao;
import com.mustafa.hrms.entites.City;

 @Service
public class CityManager implements CityService {
	
	@Autowired
	private CityDao cityDao;

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(cityDao.findAll());
	}

	@Override
	public DataResult<City> getById(int id) {
		City city=cityDao.findById(id);
		if(city==null) {
			return new ErrorDataResult<City>();
		}
		else
			return new SuccessDataResult<City>(city);
	}

}
