package basicMath;

import java.util.Scanner;

public class largestDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int largest =0;
       while(n>0)
       {
      int lastDigit = n%10;
      if(lastDigit>largest)
      {
        largest=lastDigit;
      }
     n= n/10;
       }
       System.out.println(largest);
       sc.close();
  
    }
}
