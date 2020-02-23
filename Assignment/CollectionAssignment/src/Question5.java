import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    String EmpName;
    double age;
    double salary;
    public Employee(String EmpName, double age, double salary){
        this.age=age;
        this.EmpName=EmpName;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee emp) {
        return (int) (this.salary - emp.salary);
    }
    public String toString(){
        return"Empoloyee :"+EmpName+"-"+ age+"-"+salary;
    }
}
public class Question5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("aradhya", 21, 217000);
        Employee employee2 = new Employee("aman", 18, 122000);
        Employee employee3 = new Employee("ankit", 22, 253000);
        Employee employee4 = new Employee("vinay", 20, 321000);
        List<Employee> employee = new ArrayList<>();
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);

        System.out.println(employee);

        Collections.sort(employee);
        System.out.println();
        System.out.println(employee);
    }
}
