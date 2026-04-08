//Java program to find frequency of characters

import java.util.Scanner;

public class frequencyCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        int Max=Integer.MIN_VALUE;
        int Min=Integer.MAX_VALUE;
        char max=' ';
        char min=' ';
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                char ch=(char)(i+'a');
                System.out.println(ch+" Appears "+arr[i]+" times");
            }
            if(arr[i]>Max){
                Max=arr[i];
                char ch=(char)(i+'a');
                max=ch;
            }
            else if(arr[i]<Min&&arr[i]>0){
                Min=arr[i];
                char ch=(char)(i+'a');
                min=ch;
            }
        }
       System.out.println("Maximum repeated character in the string:"+max);
       System.out.println("Minimum repeated character in the string:"+min);
       sc.close();
    }
    
}
