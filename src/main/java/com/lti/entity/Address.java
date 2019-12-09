package com.lti.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ADDRESS")
public class Address {
	
	@Id
	int houseno;
	
	String Buildingname;
	String City;
	
	@OneToOne(mappedBy = "address")
	User user;

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public String getBuildingname() {
		return Buildingname;
	}

	public void setBuildingname(String buildingname) {
		Buildingname = buildingname;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
