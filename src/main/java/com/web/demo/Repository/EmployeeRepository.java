package com.web.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.demo.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	@Query("From Employee where searchKey like %?1%")
	List<Employee> findBySearchKey(String key);
}
