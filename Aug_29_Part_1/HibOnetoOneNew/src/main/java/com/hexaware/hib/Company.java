package com.hexaware.hib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="companyhib")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int companyId;
	private String companyName;
	private String city;
	private String state;
	private String companyType;
	@OneToOne(targetEntity = Employ.class)
	private Employ employ;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public Employ getEmploy() {
		return employ;
	}
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", city=" + city + ", state="
				+ state + ", companyType=" + companyType + ", employ=" + employ + "]";
	}
	
	
}
