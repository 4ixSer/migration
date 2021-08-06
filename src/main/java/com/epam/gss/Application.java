package com.epam.gss;

import com.epam.gss.entity.Employee;
import com.epam.gss.repository.CompanyRepository;
import com.epam.gss.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(Application.class, args);
		CompanyRepository companyRepository = configurableApplicationContext.getBean(CompanyRepository.class);
//		EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
//		Company company = new Company( "EPAM");
//		Employee firstEmployee = new Employee("Sergii", "Gnuchykh", company);
//		List<Employee> employees = Arrays.asList(firstEmployee);
//				company.setEmployees(employees);
//		companyRepository.save(company);
//		System.out.println("gss 1" + company);
//		Optional<Employee> s  = employeeRepository.findById(2l);
//		Employee ssd = s.get();
		System.out.println(companyRepository.findAll());
//		System.out.println("gss " + ssd);
//		System.out.println("gss " + employeeRepository.findById(1l));
	}

}
