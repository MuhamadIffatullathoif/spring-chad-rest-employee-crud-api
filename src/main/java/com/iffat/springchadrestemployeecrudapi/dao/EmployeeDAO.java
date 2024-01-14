package com.iffat.springchadrestemployeecrudapi.dao;

import com.iffat.springchadrestemployeecrudapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
