package Assignmnent;
class Thread1 extends Thread{
    int sum=0;
    public void run(){
        synchronized (this){
            for (int i = 0; i <10 ; i++) {
                sum+=i;
            }
            notify();
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        Thread1 thread1= new Thread1();
        thread1.start();
        synchronized (thread1){
            try {
                thread1.wait();
                System.out.println("thread is waiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total :"+thread1.sum);
        }
    }
}
