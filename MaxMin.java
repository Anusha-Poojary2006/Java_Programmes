import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int max=0;
    int min=n%10;
    while(n>0){
        int num=n%10;
        if(num>max){
            max=num;
        }
        if(num<min){
            min=num;
        }
        n=n/10;
    }
    System.out.println("Maximum digit in number:"+max);
    System.out.println("Minimum digit in number:"+min);
    sc.close();
    }
}
