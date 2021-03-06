package com.epam.gss;

import com.epam.gss.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(Application.class, args);
        EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
        System.out.println("employee " + employeeRepository.findById(2l));
    }

}
