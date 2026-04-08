// Java Program to find fibonacci of number

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a  number:");
    int num=sc.nextInt();
    System.out.println("Fibonacci of "+num+" is "+fib(num));
    sc.close();
    }
}
