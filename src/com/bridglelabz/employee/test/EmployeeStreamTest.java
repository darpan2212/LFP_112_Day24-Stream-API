package com.bridglelabz.employee.test;

import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Test;

import com.bridglelabz.employee.Employee;
import com.bridglelabz.employee.EmployeeData;

public class EmployeeStreamTest {

	@Test
	public void streamForEach() {

		EmployeeData empData = new EmployeeData();
		
		Stream<Employee> empStream = empData.empList.stream();
		
		Consumer<Employee> empConsumer = e -> {
			System.out.println(
					"--------------------------------");
			System.out.println(
					"Employee name : " + e.getEmpName());
			System.out.println(
					"Employee ID : " + e.getEmpId());
			System.out.println("Salary : $" + e.getSalary()
					+ " USD per annum");
		};
		
		empStream.forEach(empConsumer);
	}

}