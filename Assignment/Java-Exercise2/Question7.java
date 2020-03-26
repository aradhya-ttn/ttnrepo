package Exercise2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number of Seconds");
        int sec=x.nextInt();
        int days,hours,minute,seconds;
        days =sec/84600;
        hours=(sec%84600)/3600;
        minute=((sec%84600)%3600)/60;
        seconds=(((sec%84600)%3600)%60);
        System.out.println("Days = "+days);
        System.out.println("Hours = "+hours);
        System.out.println("Minute = "+minute);
        System.out.println("Second = "+seconds);
    }
}
