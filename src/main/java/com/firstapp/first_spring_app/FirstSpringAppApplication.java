package com.firstapp.first_spring_app;

import com.firstapp.first_spring_app.model.Address;
import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);

		System.out.println("Hello everyone this is the first spring boot project");


		// tight coupling example
//		Employee employee1 = new Employee();
//			employee1.id = 10;
//			employee1.name ="Sam";
//			employee1.age = 27;
//			employee1.designation = "Developer";
//
//			//now for the Address we need to create object of address in main
//		Address address1 = new Address();
//		address1.doorNo = 101;
//		address1.streetName = "spring street";
//		address1.city = "london";

		//line 31 is needed to update the value to be assign to new address in tight coupling
		//address1.doorNo = 121;
//		address1.streetName = "seed street";
//		address1.city = "london";
//
//		employee1.address = address1;
//		// we see that address1 object is dependent on employee1 object
//
//		System.out.println("Employee1 details: " + employee1);
//		System.out.println("Employee1 adress details: " + address1);

		// LOOSE COUPLING: using setter injection of dependency injection loose coupling

		//create an object for employee and address

		Employee employee1 = new Employee();
		employee1.setName("jack");
		employee1.setId(121);
		employee1.setAge(29);
		employee1.setDesignation("developer");

		Address address1 = new Address();
		address1.setDoorNo(2);
		address1.setStreetName("ambedkar st");
		address1.setCity("london");
//if we print the employee details without setting Address setAddress the address value is always NULL
		employee1.setAddress(address1);

		//to update address we do not need to update address and reassign
		// instead we use 	SetAddress and directly update it in employee using getAddress
		employee1.setAddress(address1);

		employee1.getAddress().setDoorNo(1);
		employee1.getAddress().setStreetName("11 street");
		employee1.getAddress().setCity("thane");

		System.out.println("employee details are : " + employee1);
		System.out.println("employee address : " + address1);


	}

}
