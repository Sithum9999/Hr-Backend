package org.icet.learn.service.impl;

import lombok.RequiredArgsConstructor;
import org.icet.learn.dto.Employee;
import org.icet.learn.entity.EmployeeEntity;
import org.icet.learn.repository.EmployeeDao;
import org.icet.learn.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;
    private final ModelMapper modelMapper;

    @Override
    public List<Employee> all() {
        List<Employee> employeeList = new ArrayList<>();
        List<EmployeeEntity> all = employeeDao.findAll();
        all.forEach(customerEntity -> {
            employeeList.add(modelMapper.map(customerEntity,Employee.class));
        });
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeDao.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void update(Employee employee) {
        employeeDao.save(modelMapper.map(employee, EmployeeEntity.class));
    }

    @Override
    public void delete(Long id) {
        employeeDao.deleteById(id);
    }

    @Override
    public boolean existsByEmail(String email) {
        return employeeDao.existsByEmail(email);
    }
}
