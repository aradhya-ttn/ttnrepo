@FunctionalInterface
interface Twointeger{
    public int twoInteger(int a,int b);
}
public class Question2 {
    public static void main(String[] args) {
        Twointeger twointeger=(e1,e2)->e1+e2;
        System.out.println(twointeger.twoInteger(12,121));
    }
}
