package com.mustafa.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hrms.business.abstracts.JobPositionService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

	@Autowired
	private JobPositionService jobPositionService;

	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
	@GetMapping("/getbyname")
	public JobPosition getByPositionName(String positionName){
		return this.jobPositionService.getByPositionName(positionName);
	}
	@GetMapping("/getbyid")
	public DataResult<JobPosition> getById(int id){
		return this.jobPositionService.getById(id);
	}
	@PostMapping("add")
	public Result addNew(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.addNew(jobPosition);
	}
	
}