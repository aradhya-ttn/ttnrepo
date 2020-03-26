package Assignmnent;
class ThreadA implements Runnable{

    @Override
    public void run() {
        System.out.println("hello thread1");
        System.out.println(" thread---->1");
        System.out.println("bye thread1");
    }
}
class ThreadB extends Thread{
    public void run(){
        System.out.println("hello thread2");
        System.out.println("thread--------->2");
        System.out.println("bye thread2");
    }
}
public class Question2 {
    public static void main(String[] args) {
        System.out.println("hello main");
        ThreadA ta= new ThreadA();
        Thread thread= new Thread(ta);
        thread.start();
        ThreadB tb= new ThreadB();
        tb.start();
        System.out.println("bye main");

    }
}
