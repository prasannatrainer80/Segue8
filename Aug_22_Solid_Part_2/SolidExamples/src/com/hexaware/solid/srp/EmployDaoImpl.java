package com.hexaware.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		// TODO Auto-generated method stub
		employList.add(employ);
		return "Employ Record Inserted...";
	}

}
