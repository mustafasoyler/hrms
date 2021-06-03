package com.mustafa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustafa.hrms.entites.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer>{

	City findById(int id);
}
