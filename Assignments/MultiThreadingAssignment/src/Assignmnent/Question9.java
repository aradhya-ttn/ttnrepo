package Assignmnent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor1 implements Runnable
{
    private CountDownLatch latch;
    public Processor1(CountDownLatch latch)
    {
        this.latch=latch;
    }
    @Override
    public void run() {
        System.out.println("Started.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        latch.countDown();
    }
}

public class Question9 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0;i<3;i++)
        {
            executor.submit(new Processor1(latch));
        }

        try{
            latch.await();
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Completed.........");
    }
}