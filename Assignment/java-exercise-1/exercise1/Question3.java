// Q3. Write a program to find the number of occurrences of a character in a string without using loop?

package exercise1;

import java.util.Scanner;

public class Question3 {
    static  int count=0;
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the String");
        String str = x.nextLine();
        System.out.println("the character whose appearnace is required");
        char ch = x.next().charAt(0);
        System.out.println(charcounts(str, str.length() - 1, ch));
    }
    public static  int charcounts(String str,int length, char ch){
        if (length>-1){
            if(str.charAt(length)==ch){
                count++;
            }
            charcounts(str,length-1,ch);
        }
        return count;
    }
}
