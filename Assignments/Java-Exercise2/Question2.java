package Exercise2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter the String to be sorted");
        String Str=x.nextLine();
        char temp=0;
        char ch[]=Str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if (Character.toLowerCase(ch[j])>Character.toLowerCase(ch[i])){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}
