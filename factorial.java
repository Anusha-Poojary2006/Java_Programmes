//Java program to find factorial of given number using recursion function

import java.util.*;

public class factorial {
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    System.out.println("Factorial of "+num+" is "+fact(num));
    sc.close();
    }
}
