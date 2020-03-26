@FunctionalInterface
interface ConstructorRef{
    Employee object();
}

class Employee{
    String Name;
    int  Age;
    String City;
    Employee(String Name,int Age,String City){
        this.Name=Name;
        this.Age=Age;
        this.City= City;
    }

    Employee object(){
        return  this;
    }

    @Override
    public String toString() {
        return "Employee { name :"+Name+" Age : "+Age+" City : "+City+" }";
    }
}
public class Question4 {
    public static void main(String[] args) {
        ConstructorRef constructorRef = new Employee("Aradhya",21,"Noida")::object;
        System.out.println(constructorRef.object());

    }
}
