package com.example.ConnectDB.repository;

import com.example.ConnectDB.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}