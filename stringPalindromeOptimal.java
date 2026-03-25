import java.util.Scanner;

public class stringPalindromeOptimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        boolean isPalindrome=true;
        while(left<right){
            if(arr[left]!=arr[right]){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome?"It is a palindrome string":"It is not a palindrome string");

        sc.close();
    }
}
