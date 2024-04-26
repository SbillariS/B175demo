package com.crudoperationApp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.crudoperationApp.model.Employee;
import com.crudoperationApp.repository.EmployeeRepository;
import com.crudoperationApp.servicei.EmployeeServiceI;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI
{
	@Autowired
	EmployeeRepository er;

	@Override
	public void saveregister(Employee e) 
	{
		er.save(e);
	}

	@Override
	public List<Employee> loginEmployee(String username, String password) 
	{
		if(username.equals("admin") && password.equals("admin"))
		{
			return er.findAll();
		}
		else
		{
		return er.findByUsernameAndPassword(username, password);
		}
	}
	@Transactional
    @Modifying
	@Override
	public List<Employee> deletemployee(int empid) 
	{
		er.deleteById(empid);
		return er.findAll();
	}

	@Override
	public Employee editemployee(int empid) 
	{
		Employee e=er.getsingledata(empid);
		return e;

	}

	@Override
	public List<Employee> upadteEmployee(Employee e)
	{
		er.save(e);
		return (List<Employee>) er.findAll();
	}

	@Override
	public List<Employee> paging(int pageNo, int size) 
	{
		Pageable p=PageRequest.of(pageNo, size,Sort.by("username").ascending());
		return er.findAll(p).getContent();
	}

	
}
