//Java Programme for reverse the string

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev=rev+ch;
        }
        System.out.println("Reverse string:"+rev);
        if(s.equalsIgnoreCase(rev)){
            System.out.println("It is a palindrome string");
        }
        else{
            System.out.println("It is not palindrome string");
        }
        sc.close();
    }
}
