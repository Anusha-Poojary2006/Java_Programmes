
import java.util.*;
public class factorsOptimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=sc.nextInt();
        int sqrt=(int)Math.sqrt(n);
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
                System.out.print(i+" "); 
            }
        }
        for(int i=sqrt;i>=1;i--){
            if(n%i==0&&n/i!=i){
                System.out.print(n/i+" ");
            }
        }
        sc.close();
    }
}
           
        
    
