package com.jsp.college.branch.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.college.branch.dto.Branch;

public class BranchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(Branch branch) {
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return branch;
	}

	public Branch deleteBranch(Branch branch) {
		Branch branch2 = entityManager.find(Branch.class, branch.getId());
		entityTransaction.begin();
		entityManager.remove(branch2);
		entityTransaction.commit();
		return branch2;
	}

	public Branch updateBranch(Branch branch) {
		Branch branch2 = entityManager.find(Branch.class, branch.getId());
		if (branch2 != null) {
			branch2.setFloreno(branch.getFloreno());
			System.out.println("Branch Changed");
		} else
			System.out.println("Branch not Found");

		entityTransaction.begin();
		entityManager.merge(branch2);
		entityTransaction.commit();
		return branch2;
	}



}
