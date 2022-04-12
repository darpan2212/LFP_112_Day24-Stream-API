package com.bridglelabz.employee.test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.Test;

import com.bridglelabz.employee.Employee;
import com.bridglelabz.employee.EmployeeData;

public class EmployeeStreamTest {

//	@Test
	public void streamForEach() {

		EmployeeData empData = new EmployeeData();

		Stream<Employee> empStream = empData.empList
				.stream();

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

	@Test
	public void streamTransform() {

		List<Integer> intList = new LinkedList<>();

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 90 + 10);
			intList.add(num);
		}

		Stream<Integer> intStream = intList.stream();

		Function<Integer, Double> doubleMap = n -> n
				.doubleValue();

		intStream.map(doubleMap)
				.forEach(n -> System.out.println(n));
	}

}