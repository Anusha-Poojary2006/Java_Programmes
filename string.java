//Java programme to find vowels and constants in the string 

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Characters in the string:");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
        System.out.println();
        String str1=str.toLowerCase();
        System.out.println("Vowels in the string:");
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.print(ch+" ");
            }
        }
        System.out.println();
        System.out.println("Constants in the string:");
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch==' '){
                continue;
            }
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                System.out.print(ch+" ");
            }
        }
        sc.close();
    }}

