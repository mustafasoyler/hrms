package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.Cv;

public interface CvService {
    Result add(Cv cv);
    DataResult<List<Cv>> getAll();
    DataResult<Cv> findById(int id);
}