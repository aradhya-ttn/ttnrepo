package exercise1;

public class Question7 {
    static {
        System.out.print("first name is Aradhya, ");

    }
    static String lname(){
        String lastname="patel";
        return lastname;
    }
    static  int age=0;
    public static void main(String[] args) {
        age=20;
        System.out.println( "last name is "+Question7.lname()+" and age is "+ age);
    }
}
