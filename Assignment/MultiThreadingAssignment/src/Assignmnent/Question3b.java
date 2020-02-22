package Assignmnent;

import org.w3c.dom.ls.LSOutput;

    class Math {
        int x, y;

        void add(int a, int b) {
            System.out.println("hello");
            System.out.println("bye");

            synchronized (this) {
                x=a;
                y=b;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Addition :"+(x+y));

            }
        }
    }
    class MythreadB1 extends Thread{
        Maths m;
        MythreadB1(Maths t){
            m=t;
        }


        @Override
        public void run() {
            m.add(2,8);

        }
    }
    class MythreadB2 extends Thread{
      Maths m;
        MythreadB2(Maths t){
            m=t;
        }

        @Override
        public void run() {
            m.add(6,5);

        }
    }
    public class Question3b {
        public static void main(String[] args) {
            Maths m= new Maths();
           MythreadB1 t1 = new MythreadB1(m);
           MythreadB2 t2= new MythreadB2(m);
            t2.start();
            t1.start();
        }
    }

