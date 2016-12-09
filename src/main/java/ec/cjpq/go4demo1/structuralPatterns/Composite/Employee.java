package ec.cjpq.go4demo1.structuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Gang of Four Design Patterns Demo 1
 * Employee class having list of Employee objects
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-09
 */
public class Employee{

	private String name;
	private String dept;
	private int salary;

	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary){
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee employee){
		subordinates.add(employee);
	}

	public void remove(Employee employee){
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates(){
		return subordinates;
	}

	public String toString(){
		return "Employee: [ Name : " + name + ", dept : " + dept + ", salary: " + salary + " ]";
	}

}
