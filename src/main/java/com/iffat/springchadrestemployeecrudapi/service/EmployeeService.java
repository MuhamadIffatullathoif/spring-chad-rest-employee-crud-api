package com.iffat.springchadrestemployeecrudapi.service;

import com.iffat.springchadrestemployeecrudapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
