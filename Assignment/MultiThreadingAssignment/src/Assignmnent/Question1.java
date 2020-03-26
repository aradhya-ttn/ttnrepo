package Assignmnent;

import java.util.Scanner;

class Processor extends Thread{
    private volatile boolean running=true;
    public void run(){
        while(running){
            System.out.println("Threading is running");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stoping() {
        running=false;
    }
}


public class Question1 {
    public static void main(String[] args) {
        Processor processor= new Processor();
        processor.start();
        System.out.println("thread is Stopping------------------------> ");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        processor.stoping();
    }
}
