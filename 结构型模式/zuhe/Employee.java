package com.qjm.zuhe;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> list;
	public Employee(String name,String dept,int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		list=new ArrayList<Employee>();
	}
	public void add(Employee e) {
		list.add(e);
	}
	public void remove(Employee e) {
		list.remove(e);
	}
	public List<Employee> getList(){
		return list;
	}
	public String toString() {
		return ("Employee :[name:"+name+",dept:"+dept+",salary:"+salary+"]");
	}
}
