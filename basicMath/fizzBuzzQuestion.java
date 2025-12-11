package basicMath;
import java.util.*;

public class fizzBuzzQuestion {
    
//input = 5
//output = [1,2,Fizz,4,"Buzz"]

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n= sc.nextInt();
        List<String> answer = new ArrayList<>(n);
        for(int i=1;i<=n;i++)
        {
            boolean isDivisibleBy3 = i%3==0;
             boolean isDivisibleBy5 = i%5==0;
             if(isDivisibleBy3 && isDivisibleBy5)
             {
                answer.add("FizzBuzz");
             }
             else if(isDivisibleBy3)
             {
                answer.add("Fizz");
             }
            else if(isDivisibleBy5)
             {
                answer.add("Buzz");
             }
            else
            {
              answer.add(String.valueOf(i));
            }
        }
        System.out.println(answer);
        sc.close();
    }
}


