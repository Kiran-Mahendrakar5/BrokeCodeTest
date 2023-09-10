package com.xworkz.college.service;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.repo.CollegeRepo;
import com.xworkz.college.repo.CollegeRepoImpl;

public class CollegeServiceImpl implements CollegeService {

	CollegeRepoImpl repo = new CollegeRepoImpl();

	@Override
	public boolean save(CollegeDto dto) {

		if (dto != null) {
//			if (dto.getId()>= 0) {
//				if (dto.getName().length()>=3) {
//					if (dto.getLocation() .length()>=2) {
//						if (dto.getNoOfStaffs().length()>=2) {
//							if (dto.getNoOfStudents().length()>=2) {
								repo.save(dto);
								return true;

//							}
//							System.out.println("noodstu is null");
//							return false;
//						}
//						System.out.println("noodstaff is null");
//						return false;
//					}
//					System.out.println("location is null");
//					return false;
//				}
//				System.out.println("name is null");
//				return false;
//
//			}
//			System.out.println("id is 0");
//			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public List<CollegeDto> readAll() {

		return repo.readAll();
	}

}
