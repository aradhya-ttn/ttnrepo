package Assignmnent;

public class Question6 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("first task is starting");
                System.out.println("thread1 is sleeping for 2 sreconds");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("first task completed");
            }
        }) ;
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("second task completed");
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
