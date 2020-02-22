package Assignmnent;

import java.util.concurrent.*;

class AreaOfCircle implements Callable<Double> {
     double radius=0;
     public AreaOfCircle( int r){
         radius=r;
     }

    @Override
    public Double call() throws Exception {
        return java.lang.Math.PI *radius* radius;
    }
}
class AreaOfSquare implements Callable<Integer> {
   int side=0;
    public AreaOfSquare( int a){
        side=a;
    }

    @Override
    public Integer call() throws Exception {
        return side*side;
    }
}

public class Question7  {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(2);
        Future<Double> f1= service.submit(new AreaOfCircle((int) 12.5));
        Future<Integer> f2=service.submit(new AreaOfSquare(3));
        System.out.println("Area of circle having radius 12.5 : "+f1.get());
        System.out.println("Area of square having side : "+f2.get());
    }
}
