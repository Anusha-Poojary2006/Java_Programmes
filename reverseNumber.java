//Java program for reverse number using recursion

import java.util.Scanner;

public class reverseNumber {
    public static int fun(int n,int rev){
        if(n==0){
            return rev;
        }
        rev=rev*10+(n%10);
        return fun(n/10,rev);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    System.out.println("Reverse number:"+fun(num,0));
    sc.close();
    }
}
