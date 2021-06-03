package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.JobAdvertisement;
import com.mustafa.hrms.entites.dtos.JobAdvertisementForAddDto;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> findByIsActiveTrue();
    DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreateDate();
    DataResult<List<JobAdvertisement>> findByEmployer_EmployerId(int employerId);
    Result addNew(JobAdvertisementForAddDto jobAdvertisement);
    Result changeStatus(int advertisementId, int employerId);
}