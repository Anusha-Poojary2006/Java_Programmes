import java.util.*;
public class array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt(); 
    }
    System.out.println("Even element are:");
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
        }
    }
    System.out.println();
    System.out.println("Odd element are:");
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");
        }
    }
      System.out.println();
    int sum=0;
    System.out.println("sum of array element are:");
    for(int i=0;i<arr.length;i++){
        {
          sum+=arr[i];
        }
    }
    System.out.println(sum);
    sc.close();
}
}
