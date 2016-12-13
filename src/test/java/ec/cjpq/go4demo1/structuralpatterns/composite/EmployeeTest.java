package ec.cjpq.go4demo1.structuralpatterns.composite;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * Employee test class to create and print the employee hierarchy. This class demonstrate the composite Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-09
 */
public class EmployeeTest extends TestCase{

	public void test(){
		
		Employee ceo = new Employee("John", "CEO", 30000);
		
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		
		Employee headMarketing = new Employee("Michael", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		ceo.add(headSales);
		ceo.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		//Print all employees of the organization
		System.out.println("Printing the ceo employee...");
		System.out.println(ceo);

		for(Employee headEmployee: ceo.getSubordinates()){
			
			System.out.println("Printing the subordinates...");
			System.out.println(headEmployee);
			for(Employee employee: headEmployee.getSubordinates()){
				System.out.println(employee);
			}
		}

	}
}
