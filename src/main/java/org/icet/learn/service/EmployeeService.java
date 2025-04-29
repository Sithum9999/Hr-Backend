package org.icet.learn.service;

import org.icet.learn.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> all();

    void add(Employee employee);

    void update(Employee employee);

    void delete(Long id);

    boolean existsByEmail(String email);
}
