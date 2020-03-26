interface myInterface{
    public int show(int a, int b);

}
public class Question3 {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    static  int multiply(int a, int b){
        return  a*b;
    }
    public static void main(String[] args) {
        myInterface My= new Question3()::add;
        System.out.println("sum :"+My.show(12,34));
        myInterface My1= new Question3()::sub;
        System.out.println("Substraction :"+My1.show(120,34));
        myInterface My2=Question3::multiply;
        System.out.println("Multiplication :"+My2.show(12,4));
    }

}
