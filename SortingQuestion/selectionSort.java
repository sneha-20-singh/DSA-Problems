package SortingQuestion;
import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
      /*
      step 1 = find the min 
      then swap it 
       */
     
        for(int i=0;i<n-1;i++)
{
    int min=i;
    for(int j=i+1;j<n;j++)
    {
        if(arr[j]<arr[min])
        {
            min=j;
        }
    }
    //swap
    int temp = arr[min];
    arr[min]=arr[i];
    arr[i]=temp;
}
System.out.println();
System.out.println("array elements after sorting: ");
for(int i=0;i<n;i++)
{
    System.out.print(arr[i]+" ");
}

        sc.close();
    }
}
