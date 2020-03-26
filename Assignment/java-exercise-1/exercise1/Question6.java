// Q6. There is an array with every element repeated twice except one. Find that element

package exercise1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int i,j;
        Scanner x=new Scanner(System.in);
        System.out.println("enter the length of array");
        int len=x.nextInt();
        System.out.println("enter the element of array");
        int arr[]=new int[len];
        for( i=0; i<len;i++){
            arr[i]=x.nextInt();
        }
        for(i=0;i<len;i++){
            int count=0;
            for( j=0; j<len;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1) {
                System.out.println("the element is "+arr[i]);
                break;
            }
        }
    }
}
