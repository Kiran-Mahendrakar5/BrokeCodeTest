package com.xworkz.college.repo;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;

public interface CollegeRepo {

	public boolean save(CollegeDto dto);

	List<CollegeDto> readAll();

}
