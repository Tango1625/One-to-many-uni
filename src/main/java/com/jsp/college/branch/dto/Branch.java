package com.jsp.college.branch.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String branchname;
private  int floreno;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
public int getFloreno() {
	return floreno;
}
public void setFloreno(int floreno) {
	this.floreno = floreno;
}



}
