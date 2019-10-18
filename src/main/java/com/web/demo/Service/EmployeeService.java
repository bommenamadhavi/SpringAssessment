package com.web.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.demo.Model.Employee;
import com.web.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public List<Employee> findBySearchKey(String key)
	{
		return repo.findBySearchKey(key);
	}
}
