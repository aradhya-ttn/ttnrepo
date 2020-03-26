package Assignmnent;

import org.w3c.dom.ls.LSOutput;

class Maths{
    int x,y;
    synchronized void add(int x, int y){
         try {
             Thread.sleep(200);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("addition: "+(x+y));

    }

}
class Mythread1 extends Thread{
    Maths m;
    Mythread1(Maths t){
        m=t;
    }


    @Override
    public void run() {
        m.add(2,8);

    }
}
class Mythread2 extends Thread{
    Maths m;
    Mythread2(Maths t){
        m=t;
    }

    @Override
    public void run() {
        m.add(6,5);

    }
}
public class Question3a {
    public static void main(String[] args) {
        Maths m= new Maths();
        Mythread1 t1 = new Mythread1(m);
        Mythread2 t2= new Mythread2(m);
        t2.start();
        t1.start();
    }
}
