
interface OverrideDefault{
    default  void DefaultMethod(){
        System.out.println("This is default method");
    }
}

public class Question7 {
    public static void main(String[] args) {
        OverrideDefault overrideDefault=new OverrideDefault() {
            @Override
            public void DefaultMethod() {
                System.out.println("This is overridden default method");
            }
        };
        overrideDefault.DefaultMethod();
    }
}
