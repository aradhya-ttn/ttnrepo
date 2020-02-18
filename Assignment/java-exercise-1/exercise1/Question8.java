package exercise1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter the string");
        String st=x.nextLine();
        StringBuffer Str =new StringBuffer();
       Str.append(st);
        Str=Str.reverse();
        System.out.println("reverse string is "+ Str);
        Str=Str.delete(4,10);
        System.out.println("new String will be "+Str);
    }
}
