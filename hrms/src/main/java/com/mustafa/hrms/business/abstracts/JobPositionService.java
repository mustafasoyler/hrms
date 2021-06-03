package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
    JobPosition getByPositionName(String positionName);
    DataResult<JobPosition> getById(int id);
    Result addNew(JobPosition jobPosition);
}
