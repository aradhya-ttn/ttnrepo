package com.tothenew.Assignmentjpa.controller;

import com.tothenew.Assignmentjpa.entities.Employee;
import com.tothenew.Assignmentjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired

    private EmployeeRepository employeeRepository;

//(3) Perform Create Operation on Entity using Spring Data JPA

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

//    (4) Perform Update Operation on Entity using Spring Data JPA
    @PostMapping("/employees/{id}")
    public List<Employee> updateEmployee(@PathVariable Integer id , @RequestBody Employee employee) {
        Employee employees= employeeRepository.findById(id).get();
        employees.setName(employee.getName());
        employees.setAge(employee.getAge());
        employees.setLocation(employee.getLocation());
        employeeRepository.save(employees);
        return (List<Employee>)employeeRepository.findAll();
    }
//    (5) Perform Delete Operation on Entity using Spring Data JPA
    @DeleteMapping("employees/{id}")
    public List<Employee> deleteEmployee(@PathVariable Integer id){
        employeeRepository.deleteById(id);
        return (List<Employee>)employeeRepository.findAll();
    }
//    (5) Perform Read Operation on Entity using Spring Data JPA
    @GetMapping("/employees")
    public List<Employee> readEmployee() {


        return (List<Employee>) employeeRepository.findAll();
    }
//    (6) Get the total count of the number of Employees

    @GetMapping("employees/count")
    public Long countEmployee(){
        return employeeRepository.count();
    }

//    (7) Implement Pagination and Sorting on the bases of Employee Age
    @GetMapping("/employee/pagenation")
    public List<Employee> PagenationAndSorting() {
        Pageable pageable = PageRequest.of(0, 2, Sort.by(Sort.Direction.DESC, "age"));
        List<Employee> employees= new ArrayList<>();

         employeeRepository.findAll(pageable).forEach(p->employees.add(p));
         return employees;


    }

//    (8) Create and use finder to find Employee by Name

    @GetMapping("employees/{name}")
    public List<Employee> findByName(@PathVariable String name){
        List<Employee> employees=employeeRepository.findByName(name);
        return employees;
    }
//    (9) Create and use finder to find Employees starting with A character
    @GetMapping("/employees/like")
    public List<Employee> findByNameLike() {
        List<Employee> employees = employeeRepository.findByNameLike("A%");

        return employees;
    }

//(10) Create and use finder to find Employees Between the age of 28 to 32
    @GetMapping("/employees/agebetween")
    public  List<Employee> findByAgeBetween(){
        List<Employee> employees=employeeRepository.findByAgeBetween(28,32);
        return employees;
    }
}

