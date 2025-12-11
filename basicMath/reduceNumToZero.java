//problem Description
//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it
package basicMath;

import java.util.*;
public class reduceNumToZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n= sc.nextInt();
        int countSteps =0;
        while (n>0) {
            
            boolean isEven = n%2==0;
if(isEven)
{
  n=n/2;
countSteps++;
}
else{
    n-=1;
    countSteps++;
}
        }
        System.out.println("Number of steps to reduce a number to zero is: "+countSteps);
        sc.close();
    }
}
