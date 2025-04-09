package com.biswajit.service;

import org.springframework.stereotype.Component;

@Component
public class GetUserDepartmentService {
	
	public String getUserDepartment() {
		System.out.println("Coming from getUserDepartment of UserDepartment Service");
		return "Accounts";
	}
}
