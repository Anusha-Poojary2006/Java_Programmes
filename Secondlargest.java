//Java programe to find second largest element in the given array

import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt(); 
    }
    int max=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            secondMax=max;
            max=arr[i];
        }
        else if(arr[i]>secondMax && arr[i]!=max){
            secondMax=arr[i];
        }
    }
    System.out.println("Maximum element in the array:"+max);
    System.out.println("Second largest element in the array:"+secondMax);
    sc.close();
    }
}
