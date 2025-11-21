package basicMath;

import java.util.Scanner;

public class LCMBruteForce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        int result=Math.max(a,b);
while(true)
{
    if(result %a ==0 && result % b==0)
    {
        break;
    }
    result++;
}
System.out.println(result);
sc.close();
    }
}
