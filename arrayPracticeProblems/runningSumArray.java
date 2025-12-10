package arrayPracticeProblems;

import java.util.Scanner;
//array = [3 1 2 10 1]
//output = [3 4 6 16 17]
//explanation = [3 3+1 4+2 6+10 16+1]

public class runningSumArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("enter the size of array: ");
    int n = sc.nextInt();
    int[] num= new int[n];
    System.out.print("enter the elements of array: ");
       for(int i=0;i<n;i++)
       {
        num[i] = sc.nextInt();
       }
       System.out.print("array elemnts are: ");
       for(int i=0;i<n;i++)
       {
        System.out.print(num[i]+"  ");
       }
       System.out.println();
     
       for(int i=1;i<n;i++)
       {
         num[i]=num[i-1]+num[i];
       }
  System.out.print("Running sum : ");
  for(int i=0;i<n;i++)
  {
    System.out.print(num[i]+" ");
  }
  sc.close();
    }  
}

 
