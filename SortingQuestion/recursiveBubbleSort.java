package SortingQuestion;
import java.util.Scanner;
public class recursiveBubbleSort {
   static void bubbleSort(int[]arr,int n)
        {
            //base case 
            if(n==1)
            {
                return;
            }
            //one pass of bubble sort
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    //swap
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
        }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         System.out.print("enter the size of the array: ");
       
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elemnts of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
      bubbleSort(arr, n);
      for(int x:arr)
      {
        System.out.print(x+" ");
      }
        sc.close();
    }
       
}
    
