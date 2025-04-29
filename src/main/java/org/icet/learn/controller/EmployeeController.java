package org.icet.learn.controller;

import lombok.RequiredArgsConstructor;
import org.icet.learn.dto.Employee;
import org.icet.learn.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {

    final EmployeeService employeeService;

    @GetMapping("/check-email")
    public ResponseEntity<Boolean> checkEmail(@RequestParam String email) {
        boolean exists = employeeService.existsByEmail(email);
        return ResponseEntity.ok(exists);
    }

    @GetMapping("/all")
    public List<Employee> all(){
        return employeeService.all();
    }

    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        employeeService.add(employee);
    }

    @PutMapping("/update")
    public void update(@RequestBody Employee employee){
        employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        employeeService.delete(id);
    }

}
