package com.iffat.springchadrestemployeecrudapi.dao;

import com.iffat.springchadrestemployeecrudapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
