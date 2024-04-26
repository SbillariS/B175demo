package com.crudoperationApp.servicei;


import java.util.List;

import com.crudoperationApp.model.Employee;

public interface EmployeeServiceI
{
	public void saveregister(Employee e);
	public List<Employee> loginEmployee(String username,String password);
	public List<Employee>  deletemployee(int empid);
	public Employee editemployee(int empid);
	public List<Employee> upadteEmployee(Employee e);
	public List<Employee> paging(int pageNo,int size);

}
