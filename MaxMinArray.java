//Java programe to find maximum and minimum number in given array

import java.util.Scanner;

public class MaxMinArray {
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
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("Maximum element in the array:"+max);
    System.out.println("Minimum element in the array:"+min);
    sc.close();
    }
}
