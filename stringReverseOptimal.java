import java.util.Scanner;

public class stringReverseOptimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String str=new String(arr);
        System.out.println("Rverse string:"+str);
        sc.close();
    }
}
