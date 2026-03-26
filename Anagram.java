import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] ar1=s1.toCharArray();
        char[] ar2=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]!=ar2[i]){
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
