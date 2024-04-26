package com.crudoperationApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.crudoperationApp.model.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
   public List<Employee> findByUsernameAndPassword(String username,String password);
   public List<Employee> findById(int empid);
   
   @Query(value= "from Employee where empid=?1")
   public Employee getsingledata(int empid);
   
   @Transactional
   @Modifying
   @Query(value ="update Employee set empname=:nm, address=:add, mobno=:mn, age=:a, salary=:sal, username=:user,password=:pass where empid=:id ")
   public Employee updatedata(@Param("nm") String empname, @Param("add") String address, @Param("mn") long mobno,@Param("a") int age,@Param("sal") float salary,@Param("user") String username,@Param("pass") String password,@Param("id") String empid);
}
