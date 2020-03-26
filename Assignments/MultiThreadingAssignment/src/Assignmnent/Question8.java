package Assignmnent;

import java.util.concurrent.Semaphore;

import java.util.concurrent.*;

class connection{
    private Semaphore sem = new Semaphore(20);

    private int connections=0;

    public void connect() throws InterruptedException {
        sem.acquire();
        synchronized (this)
        {
            connections++;
            System.out.println("Current connections:"+ connections);
        }
        Thread.sleep(2000);
        synchronized (this)
        {
            connections--;
        }
        sem.release();
    }
}

public class Question8 {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newCachedThreadPool();
        connection obj = new connection();

        for (int i=0;i<100;i++)
        {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        obj.connect();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}