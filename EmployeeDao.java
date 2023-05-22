package com.web.dao;

import java.util.List;

import com.web.domain.Employee;

public interface EmployeeDao {

	public void createEmployee(Employee employee);

	public void createEmployeePrepared(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public Employee findEmployeeById(int employeeId);

	public Employee findEmployeeByIdPrepared(int employeeId);

	public List<Employee> findAllEmployeesPrepared();

}
