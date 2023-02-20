package com.jsp.college.branch.controller;

import java.util.ArrayList;

import com.jsp.college.branch.dto.Branch;
import com.jsp.college.branch.dto.College;
import com.jsp.college.branch.service.BranchService;
import com.jsp.college.branch.service.CollegeService;

public class BranchController {

	public static void main(String[] args) {
		// Insert A Branch

				CollegeService collegeService = new CollegeService();

				College college = collegeService.getByIdCollege(1);

				Branch branch = new Branch();
				branch.setBranchname("GEOGRAPHY");
				branch.setFloreno(10);

				ArrayList<Branch> al = new ArrayList<Branch>();
				al.add(branch);
				college.setBranch(al);

				BranchService branchService = new BranchService();
				branchService.saveBranch(branch);

		// Deleting A Branch

//				Branch branch = new Branch();
//				branch.setId(5);
		//
//				BranchService branchService = new BranchService();
//				branchService.deleteBranch(branch);

		// Updating A Branch

//				Branch branch = new Branch();
//				branch.setId(3);
//				branch.setFno(6);
		//
//				BranchService branchService = new BranchService();
//				branchService.updateBranch(branch);
					}

	}


