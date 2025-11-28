package stringQuestions;
import java.util.Scanner;
public class palindromeString {
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str= sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
     rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String is: "+rev);
        if(rev.equals(str))
        {
            System.out.println(str+" is palindrome");
        }
        else{
            System.out.println(str+" is not palindrome");
        }
        sc.close();
   } 
}

