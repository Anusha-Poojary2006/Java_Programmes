//Java Program for count the alphabets,number and special characters in a given string

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int alphabet=0;
        int number=0;
        int specialCharacter=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt((i));
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                alphabet+=1;
            }
            else if(ch>='0'&&ch<='9'){
                number+=1;
            }
            else{
                specialCharacter+=1;
            }
        }
        System.out.println("Count of alphabets:"+alphabet);
        System.out.println("Count of numbers:"+number);
        System.out.println("Count of special characters:"+specialCharacter);

        sc.close();
    }
}
