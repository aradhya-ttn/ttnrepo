import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String EmpName;
    double age;
    double salary;
    public Employee(String EmpName, double age, double salary){
        this.age=age;
        this.EmpName=EmpName;
        this.salary=salary;
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
        Comparator<Employee> comparator= new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return (int) (employee.salary - t1.salary);
            }
        };

        Collections.sort(employee, comparator);
        System.out.println();
        System.out.println(employee);
    }
}
