package com.jsp.college.branch.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.college.branch.dto.Branch;
import com.jsp.college.branch.dto.College;

public class CollegeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratham");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public College saveCollege(College college,List<Branch> branch) {
		entityTransaction.begin();
		entityManager.persist(college);
		entityManager.persist(branch);
		entityTransaction.commit();
		System.out.println("All data save");
		return college;
		
		
	}
	public College getByIdCollege(int id) {
		return entityManager.find(College.class, id);
	}
	public void getAllDetails() {
		String sql1 = "select college from College college";
		String sql2 = "select branch from Branch branch";
		Query query1 = entityManager.createQuery(sql1);
		Query query2 = entityManager.createQuery(sql2);

		List<College> colleges = query1.getResultList();
		List<Branch> branchs = query2.getResultList();
		for (College college : colleges) {
			System.out.println("===========================================================================");
			System.out.print("College id: " + college.getId() + ". ");
			System.out.print("College name: " + college.getName() + ". ");
			System.out.println("College loc:" + college.getLocation());
		}
		for (Branch branch : branchs) {
			System.out.println("===========================================================================");
			System.out.print("Branch id: " + branch.getId() + ". ");
			System.out.print("Branch name: " + branch.getBranchname() + ". ");
			System.out.println("Branch floor no:" + branch.getFloreno());
		}
	}

}
