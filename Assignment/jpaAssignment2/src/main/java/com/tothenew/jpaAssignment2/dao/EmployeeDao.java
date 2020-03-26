package com.tothenew.jpaAssignment2.dao;

import com.tothenew.jpaAssignment2.entities.Employee;
import com.tothenew.jpaAssignment2.entities.EmployeeFirstNameLastName;
import com.tothenew.jpaAssignment2.entities.EmployeeIdFnameAge;
import com.tothenew.jpaAssignment2.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployee(){
        return employees;
    }

    public List<Employee> addEmployee(Employee employee){
        employeeRepository.save(employee);
         return (List<Employee>) employeeRepository.findAll();
    }

    public List<EmployeeFirstNameLastName> salaryGreaterThanAvgSalary(){

        List<EmployeeFirstNameLastName> firstNameLastNames = new ArrayList<>();


        Sort sort =Sort.by(Sort.Order.asc("age"),Sort.Order.desc("salary"));

        List<Object[]> employeelist = employeeRepository.findFirstAndLastName(sort);
        for (Object[] objects: employeelist) {
            firstNameLastNames.add(new EmployeeFirstNameLastName(objects[0].toString(), objects[1].toString()));
        }

        return firstNameLastNames;

    }
    public List<Employee> updatesalary(Integer salary){
        Integer avg=employeeRepository.averageSalary();
        employeeRepository.updateSalary(salary,avg);
        return employees;
    }

    public void deleteEmployeeWithMinSalary(){
        Integer min= employeeRepository.minSalary();
        employeeRepository.deleteEmployee(min);
    }

    public List<EmployeeIdFnameAge> lastNameSingh(){
        List<EmployeeIdFnameAge> idFnameLnameList = new ArrayList<>();
        List<Object[]> employeelist =employeeRepository.lnameSingh();
        for (Object[] objects: employeelist) {
            idFnameLnameList.add(new EmployeeIdFnameAge((Integer) objects[0] ,objects[1].toString(), (Integer)objects[2]));
        }
        return idFnameLnameList;
    }
    public void deleteEmployeeWhereAgeIsLessThan(Integer age){
       employeeRepository.delete(age);

    }
}
