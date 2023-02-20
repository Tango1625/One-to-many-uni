package com.jsp.college.branch.service;

import com.jsp.college.branch.dao.BranchDao;
import com.jsp.college.branch.dto.Branch;

public class BranchService {
	BranchDao branchDao = new BranchDao();

	public Branch saveBranch(Branch branch) {
		return branchDao.saveBranch(branch);
	}

	public Branch deleteBranch(Branch branch) {
		return branchDao.deleteBranch(branch);
	}

	public Branch updateBranch(Branch branch) {
		return branchDao.updateBranch(branch);
	}
}
