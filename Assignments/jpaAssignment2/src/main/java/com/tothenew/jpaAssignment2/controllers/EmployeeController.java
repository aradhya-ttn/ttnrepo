package com.tothenew.jpaAssignment2.controllers;

import com.tothenew.jpaAssignment2.dao.EmployeeDao;
import com.tothenew.jpaAssignment2.entities.Employee;
import com.tothenew.jpaAssignment2.entities.EmployeeIdFnameAge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

   @Autowired
    EmployeeDao employeeDao;

     @PostMapping("/employees")
    public List<Employee> addEmployee(@RequestBody Employee employee){
       return employeeDao.addEmployee(employee);
    }

//   1.  Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.


    @GetMapping("/employees")
    public Object firstAndLastName(){
        return employeeDao.salaryGreaterThanAvgSalary();

    }

//   2. Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @PostMapping("/employees/salary/update")
    public String updatesalary(@RequestParam("salary")Integer salary){
          employeeDao.updatesalary(salary);
          return "Salary of Employyes Updated Succesfully";
    }



//    3. Delete all employees with minimum salary.

    @DeleteMapping("/employees/delete/minimumsalary")
    public String deleteEmployeeWithMinimumSalary(){
          employeeDao.deleteEmployeeWithMinSalary();
          return "Employee Deleted Succesfully";
     }

//  4. Display the id, first name, age of all employees where last name ends with "singh"
    @GetMapping("/employees/singh")
    public List<EmployeeIdFnameAge> lnameSingh(){
         return employeeDao.lastNameSingh();
    }


//    5. Delete all employees with age greater than 45(Should be passed as a parameter)
    @DeleteMapping(path ="/employees/delete")
    public void deleteEmployee(@RequestParam("Age") Integer age){
        employeeDao.deleteEmployeeWhereAgeIsLessThan(age);
    }


}
