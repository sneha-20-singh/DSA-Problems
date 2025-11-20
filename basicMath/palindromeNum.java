package basicMath;

import java.util.Scanner;

public class palindromeNum {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int reverseNum=0;
        while(num>0)
        {
int lastDigit = num%10;
reverseNum=(reverseNum*10)+lastDigit;
num=num/10;
        }
        if(reverseNum == dup)
{
System.out.println("It is a palindrome Number");
}
else{
  System.out.println("It is not a palindrome Number");  
}
        sc.close();
    }
}
