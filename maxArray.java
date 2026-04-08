//Java program to find maximum element in the array using recursion

import java.util.Scanner;

public class maxArray {
    public static int fun(int arr[],int index,int max){
        if(index==arr.length){
            return max;
        }
        if(arr[index]>max){
            max=arr[index];
        }
        return fun(arr,index+1,max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter the size of the array:"));
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elments:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element in the array:"+fun(arr,0,Integer.MIN_VALUE));
        sc.close();
    }
}
