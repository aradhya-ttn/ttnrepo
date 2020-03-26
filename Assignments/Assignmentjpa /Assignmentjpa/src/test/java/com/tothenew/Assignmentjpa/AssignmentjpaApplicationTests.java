package com.tothenew.Assignmentjpa;

import com.tothenew.Assignmentjpa.entities.Employee;
import com.tothenew.Assignmentjpa.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AssignmentjpaApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void PagenationAndSorting(){
		Pageable pageable= PageRequest.of(1,2,Sort.by(Sort.Direction.DESC ,"age"));
		employeeRepository.findAll(pageable).forEach(p-> System.out.println(p.getName()+" "+p.getAge()));
	}

}
