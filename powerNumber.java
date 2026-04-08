//Java program to find power of given number

import java.util.Scanner;

public class powerNumber {
    public static int fun(int base,int power){
        if(power==0){
            return 1;
        }
        return base*fun(base,power-1);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a base number:");
    int base=sc.nextInt();
    System.out.println("Enter a power:");
    int power=sc.nextInt();
    System.out.println(base+" to the power "+power+" is "+fun(base,power));
    sc.close();
    }
    
}
