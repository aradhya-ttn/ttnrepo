package com.tothenew.jpaAssignment2.repositories;

import com.tothenew.jpaAssignment2.entities.Employee;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> , PagingAndSortingRepository<Employee,Integer> {

    @Query("select firstname,lastname from Employee em where salary>(select avg(salary) from em)")
    List<Object[]> findFirstAndLastName(Sort sort);

    @Query("select avg(salary) from Employee")
    public Integer averageSalary();

    @Modifying
    @Transactional
    @Query(" update Employee set salary=:salary where salary < :avg")
    public void updateSalary(@Param("salary") Integer Salary,@Param("avg") Integer avg);

    @Query("select min(salary) from Employee")
    public Integer  minSalary();

    @Modifying
    @Transactional
    @Query(" delete from Employee where salary = :min")
    public void deleteEmployee(@Param("min") Integer min);

    @Query(value = "select empid, empfirstname,empage from employeetable where emplastname='singh'" ,nativeQuery = true)
    List<Object[]> lnameSingh();

    @Modifying
    @Transactional
    @Query(value = "delete from employeetable where empage> :Age",nativeQuery = true)
    void  delete(@Param("Age") Integer Age);
}
