package Exercise2;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.css.CSS2Properties;

class Copy2 implements Cloneable{
    int b=10;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Question5a {
    public static void main(String[] args) throws CloneNotSupportedException {
        Copy2 c2= new Copy2();
        c2.b=20;
        Copy2 c1=(Copy2)c2.clone();

        System.out.println(c2.b);
        System.out.println(c1.b);

    }
}
