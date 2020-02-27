// Q5. Find common elements between two arrays.
package exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the length of the  first array");
        int l1 = x.nextInt();
        System.out.println("enter the element of array");
        int ar1[] = new int[l1];
        for (int i = 0; i <= l1 - 1; i++) {
            ar1[i] = x.nextInt();
        }
        System.out.println("enter the length of the second array");
        int l2 = x.nextInt();
        int ar2[] = new int[l2];
        System.out.println("enter the element of the array");
        for (int i = 0; i <= l2 - 1; i++) {
            ar2[i] = x.nextInt();
        }
        int freq[]= new int[10000];
        for(int i=0;i<ar1.length;i++){
            freq[ar1[i]]++;
        }
        for(int j=0;j<ar2.length;j++){
            if (freq[ar2[j]]>0){
                System.out.println(ar2[j]);
                freq[ar2[j]]=0;
            }
        }
    }

}

