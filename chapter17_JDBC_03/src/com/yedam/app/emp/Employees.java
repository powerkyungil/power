package com.yedam.app.emp;

import java.sql.Date;

public class Employees {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNunber;
	private Date hireDate;
	private String jobId;
	private int salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNunber() {
		return phoneNunber;
	}
	public void setPhoneNunber(String phoneNunber) {
		this.phoneNunber = phoneNunber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNunber=" + phoneNunber + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", commissionPct=" + commissionPct + ", managerId=" + managerId
				+ ", departmentId=" + departmentId + "]";
	}
	
	
	
}
