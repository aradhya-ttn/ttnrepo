// Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?

package exercise1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("enter the String");
        String Str=z.nextLine();
        String words[]= Str.split(" ");

        for(int i=0;i<words.length;i++){
            int count=wordcount(words[i], words);
            if(count >1 && words[i]!=""){
                System.out.println(words[i]);
            }
        }
    }
    public static  int wordcount(String Str ,String[] words){
        int count=0;
        for(int i=0;i<words.length;i++){
            if(Str.equalsIgnoreCase(words[i])){
                count++;
                if(count>1){
                words[i]="";}
            }

        }
        return count;
    }
}
