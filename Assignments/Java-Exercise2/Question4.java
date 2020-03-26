package Exercise2;
class Singleton{
    private static Singleton oneObject=null;
    public String Str;
    private Singleton(){
        Str="this is a Singleton class";
     }
    public static Singleton getObject(){
        if (oneObject==null){
            oneObject=new Singleton();
        }
        return oneObject;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getObject();
        System.out.println(singleton.Str);

    }
}
