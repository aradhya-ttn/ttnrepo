package Assignmnent;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GetEven implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("even :" + i);

            }
        }
    }
}
class GetOdd implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if(i%2==1){
                System.out.println("odd :"+i);
            }
        }
    }
}

public class Question4{
    int count=0;
    public static void main(String[] args) {
       GetEven ge=new GetEven();
       GetOdd go=new GetOdd();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(ge);
        executorService.submit(go);

    }

}
