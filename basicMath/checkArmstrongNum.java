package basicMath;
import java.util.*;
public class checkArmstrongNum {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum=0;
        int dup=num;
        while(num>0)
        {
            int lastDigit = num%10;
sum=sum+(lastDigit*lastDigit*lastDigit);
num=num/10;
        }
        if(sum==dup)
        {
        System.out.println("It is an armstrong number");
        }
        else{
          System.out.println("It is not an armstrong number");   
        }
        sc.close();
    }
}
