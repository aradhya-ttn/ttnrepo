package Exercise2;

import java.sql.SQLOutput;
import java.util.Scanner;

class CustomException extends Exception{
    CustomException(String Str,boolean flag){
        super(Str,null,flag,!flag);
    }
}

public class Question13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the age");
        int age = x.nextInt();
        try {
            if (age < 18) {
                throw new CustomException("you are not adult", true);
            } else {
                System.out.println("you are adult");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
