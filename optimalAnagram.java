//Optimal solution for anagram program

import java.util.Scanner;

public class optimalAnagram {
    public static boolean isAnagram(String s1,String s2){
        int arr[]=new int[26];
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            arr[c1-'a']++;
            arr[c2-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string 1:");
        String s1=sc.nextLine();
        System.out.println("Enter a string 2:");
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1,s2)?"Anagram":"Not Anagram");
        sc.close();
    }
}
