package com.crudoperationApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crudoperationApp.model.Employee;
import com.crudoperationApp.servicei.EmployeeServiceI;

@Controller
public class HomeController
{
	@Autowired
	EmployeeServiceI ssi;
	
	@RequestMapping("/")
    public String prelogin()
    {
		return "login";
    	
    }
	@RequestMapping("/openreg")
    public String preregister()
    {
		return "register";
    	
    }
	@RequestMapping("/register")
    public String saveregister(@ModelAttribute Employee s,Model m)
    {
		ssi.saveregister(s);
		return "login";
    }
	@RequestMapping("/log")
	public String loginEmployee(@RequestParam String username,@RequestParam String password,Model m)
	{
		List<Employee> list=ssi.loginEmployee(username, password);
		if(!list.isEmpty())
		{
		   m.addAttribute("data", list);
		  return "success";
		}
		else {
		return "login";
		}
	
	}
	@RequestMapping("/delete")
	public String deletemployee(@RequestParam int empid,Model m)
	{
		System.out.println(empid);
		List<Employee> list=ssi.deletemployee(empid);
		m.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editemployee(@RequestParam int empid,Model m)
	{
		Employee list=ssi.editemployee(empid);
		m.addAttribute("stu", list);
		return "Edit";
	}
	@RequestMapping("/update")
	public String upadteEmployee(@ModelAttribute Employee s,Model m )
	{
	  List<Employee> list=ssi.upadteEmployee(s);
			  m.addAttribute("data", list);
		return "success";
		
	}
	@RequestMapping("/paging")
	public String paging(@RequestParam int pageNo,Model m)
	{
		List<Employee> list=ssi.paging(pageNo, 3);
		  m.addAttribute("data", list);
		return "success";
		
	}
	
}
