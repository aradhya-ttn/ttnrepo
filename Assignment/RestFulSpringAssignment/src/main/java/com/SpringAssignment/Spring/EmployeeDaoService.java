package com.SoringBootsAssignment.SpringAssignment.Spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {
        private static int employeeCount=0;
    public static List<Employee> employeeList= new ArrayList<>();
    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public Employee addEmployee(Employee employee){
        if(employee.getId()==null){
            employee.setId(++employeeCount);
        }
        employeeList.add(employee);
            return employee;

    }

    public Employee findOne(int id){
        for (Employee employee : employeeList) {
            if(employee.getId()==id){
                return employee;
            }
        }
        return null;
    } public Employee DeleteOne(int id){
        Iterator<Employee> iterator= employeeList.iterator();
        while (iterator.hasNext()){
            Employee employee=iterator.next();
            if(employee.getId()==id){
                iterator.remove();
                return employee;
            }
        }
        return null;
    }


    public void putEmployee(Integer Id , Employee employee) {
        Iterator<Employee> iterator= employeeList.iterator();
        while (iterator.hasNext()){
            Employee emp=iterator.next();
            if(emp.getId()== Id){
                emp.setName(employee.getName());
                emp.setAge(employee.getAge());
            }

            }

    }
}
