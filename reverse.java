//Java programme to reverse the number

import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.println("reverse number:"+reverse);
        if(original==reverse){
            System.out.println("It is palindrome number");
        }
        else{
            System.out.println("It is not palindrome number");
        }
        sc.close();
    }
}
