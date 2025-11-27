package arrayPracticeProblems;

import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);  
       int arr[]={1,4,6,7,8,9};
       System.out.print("Enter the target: ");
       int target=sc.nextInt(); 
       boolean found = false;
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]==target)
         {
            System.out.println("Element"+" "+target+" "+"found at index: "+i );
            found=true;
            break;
         }
       }
       if(!found)
       {
            System.out.println("There is no such Element"); 
       }
       sc.close();
    }
  
   
}
