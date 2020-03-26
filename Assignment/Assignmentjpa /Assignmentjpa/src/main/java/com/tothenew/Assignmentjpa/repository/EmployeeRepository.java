package com.tothenew.Assignmentjpa.repository;

import com.tothenew.Assignmentjpa.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

//(2) Set up EmployeeRepository with Spring Data JPA

public interface EmployeeRepository extends CrudRepository<Employee,Integer> , PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByNameLike(String name);

    List<Employee> findByAgeBetween(Integer age1, Integer age2);

}
