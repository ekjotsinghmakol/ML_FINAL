package com.bhavna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.bhavna.bean.Customer;

public class BankService {

	List<Customer> list1 = new ArrayList<Customer>();

	{
		list1.add(new Customer(101, "Ekjot", "New Delhi", 90000));
		list1.add(new Customer(102, "Daksh", "New Delhi", 80000));
		list1.add(new Customer(103, "Dishan", "Gurgaon", 120000));
		list1.add(new Customer(104, "Akshat", "Noida", 80000));
		list1.add(new Customer(105, "Aryaman", "Noida", 200000));

	}
	// Operations

	public void custOperations() {

		// No of employees working in Noida.
		Long empNo = list1.stream().filter(emp -> emp.getLocation().equals("Noida")).count();
		System.out.println("Employees working in noida " + empNo);

		// List of employees whose name starts with D
		List<Customer> nameList = list1.parallelStream().filter(emp -> emp.getName().startsWith("D")).toList();
		System.out.println("Name of employees starting with D are " + nameList);

		// List of employees whose salary is greater than 100000
		List<Customer> salaryList = list1.parallelStream().filter(emp -> emp.getBalance() > 100000).toList();
		System.out.println(salaryList);

		// Converting list into set with only names displaying
		Set<String> setNew = list1.stream().map(emp -> emp.getName()).collect(Collectors.toSet());
		System.out.println(setNew);

		// Amount spent by the company on employees per month
		Double totalAmount = list1.parallelStream().collect(Collectors.summingDouble(emp -> emp.getBalance()));
		System.out.println(totalAmount);

		// Map using location as key
		Map<String, List<Customer>> map = list1.stream().collect(Collectors.groupingBy(Customer::getLocation));
		System.out.println(map);

		// List into a map
		Map<Integer, Customer> map2 = list1.stream().collect(Collectors.toMap(Customer::getId, Function.identity()));
		System.out.println(map2);
		
		//Avg balance of employees

		Double avgBalance = list1.stream().collect(Collectors.averagingDouble(emp->emp.getBalance()));
		System.out.println("Avg balance is "+ avgBalance);
	}

}
