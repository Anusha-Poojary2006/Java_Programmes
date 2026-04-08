//Java Program for left rotation

import java.util.*;
public class leftrotation {
    public static void reverse(int[] arr,int left,int right){
    while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left+=1;
        right-=1;
    }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt(); 
    }
    System.out.println("Enter a k value:");
    int k=sc.nextInt();
    if(k>arr.length){
        k=k/2;
    }
    reverse(arr,0,k-1);
    reverse(arr,k,arr.length-1);
    reverse(arr,0,arr.length-1);
    System.out.println("Left rotation:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    sc.close();
    }
}
