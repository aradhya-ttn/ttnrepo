// Q1. Write a program to replace a substring inside a string with other string ?

package exercise1;
import java.lang.*;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=str.nextLine();
        System.out.println("Enter the SubString to be replaced");
        String SubStr=str.nextLine();
        System.out.println("Enter the string which will replace");
         String newStr= str.nextLine();
        str1= str1.replace(SubStr,newStr);
        System.out.println( str1);

    }


}
