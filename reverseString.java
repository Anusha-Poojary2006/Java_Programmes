//java programme to reverse the string using recursion

import java.util.Scanner;

public class reverseString {
    public static String fn(String s1){
        if(s1.length()==0){
            return "";
        }
        char ch=s1.charAt(s1.length()-1);
        return ch+fn(s1.substring(0,s1.length()-1));

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String s1=sc.nextLine();
    System.out.println("Reverse of the given string is "+fn(s1));
    sc.close();
    }
}
