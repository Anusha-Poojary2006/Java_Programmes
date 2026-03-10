import java.util.*;
public class arrayReverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt(); 
    }
    int left=0;
    int right=arr.length-1;
    while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left+=1;
        right-=1;
    }
    System.out.println("Reverse array elements are:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    sc.close();
    }
}
