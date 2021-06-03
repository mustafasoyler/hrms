package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.entites.City;

public interface CityService {

	   DataResult<List<City>> getAll();
       DataResult<City> getById(int id);
}
