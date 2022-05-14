package com.education.InstitutionManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.education.InstitutionManagement")
public class InstitutionManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(InstitutionManagementApplication.class, args);
	}
}
