package com.lti.main;

import java.time.LocalDate;

import com.lti.dao.EmployeeDao;
import com.lti.entity.Employee;

public class MainclassEmp {
	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.setName("Mark");
//		emp.setSalary(15000);
//		emp.setDateofjoining(LocalDate.of(2019, 03, 05));
//		EmployeeDao dao= new EmployeeDao();
//		dao.add(emp);
		
		EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.fetch(81);
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDateofjoining());
	}
}
