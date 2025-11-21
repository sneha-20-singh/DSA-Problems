//by Euclid's Algorithm
package basicMath;
import java.util.Scanner;
public class LCM {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("enter the second number: ");
        int n2=sc.nextInt();
           int temp1=n1;
        int temp2=n2;
        int LCM;  
         while(n1>0 && n2>0)
        {
            if(n1>n2)
            {
n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }       
        }
        if(n1==0)
        {
System.out.println(n2);
LCM= (temp1*temp2)/n2;
System.out.println(LCM);
        }
        else{
          System.out.println(n1);
           LCM= (temp1*temp2)/n1;
           System.out.println(LCM);
        }
         sc.close();
    }
}
