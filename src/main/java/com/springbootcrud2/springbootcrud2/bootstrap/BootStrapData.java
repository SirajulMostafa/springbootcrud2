package com.springbootcrud2.springbootcrud2.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootcrud2.springbootcrud2.domain.Employee;
import com.springbootcrud2.springbootcrud2.repositories.EmployeeRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;
	

	public BootStrapData(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("abc","Mostafa","email123@gmail.com","28");
		Employee emp1 = new Employee("Akbar","Hossain","akbar@gmail.com","23");
		Employee emp2 = new Employee("Hossain","Rahman","hossain@gmail.com","29");
		Employee emp3 = new Employee("Hossain1","Rahman1","hossain1@gmail.com","29");
	
		for(int i=0;i<1000;i++) {
			String email ="sirajul"+i+"@gmail.com";
			employeeRepository.save(new Employee("Sirajul", "Mostafa", email,"29"));
			

		}
//employeeRepository.save(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com","29"));
		
		
//	employeeRepository.save(emp);
//	employeeRepository.save(emp1);
//	employeeRepository.save(emp2);
//	employeeRepository.save(emp3);
	System.out.println("start bootstrap: employee auto create number" +employeeRepository.count());
	}

}
