package com.example.starter.config;

import java.util.List;
import java.util.ArrayList;

import com.example.starter.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ali", 1, "veli"));
        employeeList.add(new Employee("kali", 2, "linux"));
        employeeList.add(new Employee("adli", 3, "vaka"));
        return employeeList;
    }
}
