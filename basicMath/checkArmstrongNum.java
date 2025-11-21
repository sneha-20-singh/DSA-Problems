package basicMath;
import java.util.*;
public class checkArmstrongNum {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int sum=0;
        int count=0;
        int dup=num;//storing value of num for future use
        int original=num;//storing value of num for future use
        //count digits
        while(dup>0)
        {
            count++;
            dup/=10;
        }
        //calculate sum of digits
        while(num>0)
        {
            int lastDigit = num%10;
sum=sum+(int)Math.pow(lastDigit,count);
num=num/10;
        }
        if(sum==original)
        {
        System.out.println("It is an armstrong number");
        }
        else{
          System.out.println("It is not an armstrong number");   
        }
        sc.close();
    }
}
