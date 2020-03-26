package Exercise2.Question3;
class Example{
    void NoClass(){
        System.out.println("NoClassDefFoundError ");
    }
}
public class Question3b {
    public static void main(String[] args) {
        Example ex= new Example();
        ex.NoClass();
    }
}
