//Reverse a number
package basicMath;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int reversedNum=0;
        while(num>0)
        {
           int lastDigit = num%10;
           reversedNum=(reversedNum*10)+lastDigit;
           num=num/10;
        }
System.out.println(reversedNum);
sc.close();
    }
}
