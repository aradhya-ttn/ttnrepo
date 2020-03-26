package Exercise2;

import java.util.Scanner;

public class Question8b {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter the words");
        do{
            String word=x.nextLine();
            if(word.equals("done")){
                break;
            }else{
                System.out.println(checkFirstLast(word));
            }
        }while(true);
    }
    public static String  checkFirstLast(String s){
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return "first and last words are equal";
        }else{
            return  "first and last words are not equal";
        }
    }

}
