package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//defining class name as Table name
@Table
public class Personalinfos {
//Defining policyno id as primary key
@Id
@Column
private String policynoid;

@Column
private long phoneno;
@Column
private String name;
@Column
private String dob;
@Column
private String product;
@Column
private String gender;
@Column
private String height;
@Column
private String weight;
@Column
private String health;
@Column
private String plan;
@Column
private String term;
@Column
private String state;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}





public String getPolicynoid() {
	return policynoid;
}

public void setPolicynoid(String policynoid) {
	this.policynoid = policynoid;
}

public long getPhoneno() {
	return phoneno;
}

public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getProduct() {
	return product;
}

public void setProduct(String product) {
	this.product = product;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getHeight() {
	return height;
}

public void setHeight(String height) {
	this.height = height;
}

public String getWeight() {
	return weight;
}

public void setWeight(String weight) {
	this.weight = weight;
}

public String getHealth() {
	return health;
}


public void setHealth(String health) {
	this.health = health;
}

public String getPlan() {
	return plan;
}

public void setPlan(String plan) {
	this.plan = plan;
}

public String getTerm() {
	return term;
}

public void setTerm(String term) {
	this.term = term;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}



}
