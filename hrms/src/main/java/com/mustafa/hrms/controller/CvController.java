package com.mustafa.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hrms.business.abstracts.CvService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.Cv;

@RestController
@RequestMapping("/api/cv")
public class CvController {
	
	@Autowired
	private CvService service;

	@PostMapping("/add")
	public Result add(Cv cv) {
		return this.service.add(cv);
	}
	@GetMapping("/getall")
	public  DataResult<List<Cv>> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping("/{id}")
	public DataResult<Cv> findById(@RequestParam int id){
		return this.service.findById(id);
	}
}
