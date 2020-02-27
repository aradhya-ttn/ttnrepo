// Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

package exercise1;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int l=0,u=0,d=0,sp=0;
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the String");
        String Str=x.nextLine();
        int len=Str.length();
        for (int i=0;i<Str.length();i++) {
            char ch=Str.charAt(i);
            if(Character.isUpperCase(ch)){
                u++;
            }
            else if(Character.isLowerCase(ch)){
                l++;
            }
            else if(ch>=48 && ch<=57){
                d++;
            }
            else{
                sp++;
            }
        }
        float pu=(float)(u*100)/len;
        float pl=(float)(l*100)/len;
        float pd=(float)(d*100)/len;
        float psp=(float)(sp*100)/len;
        System.out.println("No. of lowercase alphabet "+l+" percentage is "+pl+"%");
        System.out.println("No. of Uppercase alphabet "+u+" percentage is "+pu+"%");
        System.out.println("No. of digit "+d+" percentage is "+pd+"%");
        System.out.println("No. of Character "+sp+" percentage is "+psp+"%");
    }

}
