package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptable")
public class Employee {
@Id
@GeneratedValue
private int empno;
private String name;
private double salary;
private LocalDate dateofjoining;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public LocalDate getDateofjoining() {
	return dateofjoining;
}
public void setDateofjoining(LocalDate dateofjoining) {
	this.dateofjoining = dateofjoining;
}

}
