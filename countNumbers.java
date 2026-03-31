//Java programme to count digits in a given number using recursion

import java.util.Scanner;

public class countNumbers {
    public static int fn(int num){
        if(num==0){
            return 0;
        }
        return 1+fn(num/10);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    System.out.println("Number of digits in the given number:"+fn(num));
    sc.close();
    }
}
