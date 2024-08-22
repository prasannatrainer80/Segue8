package com.hexaware.solid;

import java.util.ArrayList;
import java.util.List;

class Employ {
	
	private int empno;
	private String name;
	private double basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employ() {
		// TODO Auto-generated constructor stub
	}
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public String addEmploy(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}
}

public class SingleRepo1 {
	public static void main(String[] args) {
		Employ employ1 = new Employ(1, "Raj", 88423);
		employ1.addEmploy(employ1);
		System.out.println(employ1.showEmploy());
	}
}
