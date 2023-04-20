package com.company.app.emp;

import lombok.Data;

@Data
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String hireDate;
	String jobId;
	double salary;
	double commissionPct;
	int managerId;
	int departmentId;
}
