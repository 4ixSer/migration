package com.epam.gss;

import com.epam.gss.entity.Employee;
import com.epam.gss.repository.CompanyRepository;
import com.epam.gss.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {

	@Test
	void testMigrationUser() {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(Application.class);
		EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
		Employee employee = employeeRepository.findById(2l).get();
		String expected = "Tania";
		String actual = employee.getName();
		assertEquals(expected, actual);
	}

	@Test
	void testMigrationAll() {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(Application.class);
		EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		int expected = 2;
		int actual = employees.size();
		assertEquals(expected, actual);
	}

	@Test
	void testMigrationCompany() {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(Application.class);
		EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
		Employee employee = employeeRepository.findById(1l).get();
		String expected = "EPAM";
		String actual = employee.getCompany().getName();
		assertEquals(expected, actual);
	}
}
