import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String StName;
    double age;
    double score;
    Student(String StName, double age,double score){
        this.age=age;
        this.StName= StName;
        this.score=score;
    }

    @Override
    public int compareTo(Student student) {
        int result;
        if(this.score-student.score==0){
             result= this.StName.compareTo(student.StName);
        }
        else{
            result= (int) (this.score-student.score);
        }
        return  result;
    }
    public String toString(){
        return "Student : "+StName+" "+age+" "+score;
    }
}
public class Question6 {
    public static void main(String[] args) {
        Student student1= new Student("aradhya",21,234);
        Student student2= new Student("ankit",22,234);
        Student student3= new Student("aman",18,246);
        Student student4= new Student("vinay",20,194);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println();
        System.out.println(studentList);

    }
}
