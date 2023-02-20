package com.jsp.college.branch.service;

import java.util.List;

import com.jsp.college.branch.dao.CollegeDao;
import com.jsp.college.branch.dto.Branch;
import com.jsp.college.branch.dto.College;

public class CollegeService {
	CollegeDao collegeDao = new CollegeDao();

	public College saveCollege(College college, List<Branch> branch) {
		return collegeDao.saveCollege(college, branch);

	}

	public College getByIdCollege(int id) {
		return collegeDao.getByIdCollege(id);
	}

	public void getAllDetails() {
		collegeDao.getAllDetails();
	}
}
