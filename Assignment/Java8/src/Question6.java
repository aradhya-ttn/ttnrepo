
interface DefaultStatic{
    default void defalutMethod(){
        System.out.println("This is default Method");
    }
    static  void StaticMethod(){
        System.out.println("This is Static Method");
    }
}

public class Question6 implements DefaultStatic {

    public static void main(String[] args) {
        Question6 def= new Question6();
        def.defalutMethod();
        DefaultStatic.StaticMethod();
    }

}
