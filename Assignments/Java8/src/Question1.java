import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface greater{
    public boolean checkGreater(int a, int b);
}
@FunctionalInterface
interface increment{
    public int Increment(int a);
}
@FunctionalInterface
interface Concatinate{
    public String concat(String a, String b);
}
@FunctionalInterface
interface  UpperCase{
    public String uppercase(String a);
}
public class Question1 {
    public static void main(String[] args) {
        /////////-----Answer1(a)-----////////////////////
        greater Greater = (e1, e2) -> e1 > e2;
        System.out.println(Greater.checkGreater(4, 3));
        /////////-----Answer1(b)-----////////////////////
        increment inr = (e) -> e + 1;
        System.out.println(inr.Increment(3));
        /////////-----Answer1(c)-----////////////////////
        Concatinate con=(e1,e2) ->e1.concat(e2);
        System.out.println(con.concat("aradhya","Patel"));
        /////////-----Answer1(d)-----////////////////////
        UpperCase upper=(e)->e.toUpperCase();
        System.out.println(upper.uppercase("xvgsfdfwdw"));
    }
}
