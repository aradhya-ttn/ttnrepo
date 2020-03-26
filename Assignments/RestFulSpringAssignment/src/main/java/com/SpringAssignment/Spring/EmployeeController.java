package com.SoringBootsAssignment.SpringAssignment.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeDaoService service;
    private Employee employee;
    private Integer id;

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return service.getEmployeeList();

    }
    @GetMapping("/employees/{id}")
    public  EntityModel<Employee> retrieveEmployeeById(@PathVariable int id){
         Employee  employee=service.findOne(id);
        if(employee==null)
            throw new EmployeeNotFoundException("id -"+id);

        EntityModel<Employee> employeeEntityModel= new EntityModel<>(employee);
        WebMvcLinkBuilder linkTo=linkTo(methodOn(this.getClass()).getEmployee());

        employeeEntityModel.add(linkTo.withRel("all-Employee"));
        return employeeEntityModel;
    }
    @DeleteMapping("/employees/{id}")
    public  Employee deleteEmployeeById(@PathVariable int id){
         Employee  employee=service.DeleteOne(id);
        if(employee==null)
            throw new EmployeeNotFoundException("id -"+id);
        return employee;
    }
    @PostMapping("/employees")
    public ResponseEntity<Object> addEmployee(@Valid @RequestBody Employee employee){

        Employee savedEmployee= service.addEmployee(employee);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(savedEmployee.getId()).toUri();

        return  ResponseEntity.created(location).build();
    }
    @PutMapping("/employees/{id}")
    public void putEmployee(@PathVariable Integer id,@RequestBody Employee employee) {
        service.putEmployee( id, employee);

    }
}
