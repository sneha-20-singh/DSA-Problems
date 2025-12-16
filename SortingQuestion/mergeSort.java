package SortingQuestion;

import java.util.Scanner;


public class mergeSort {
    static void MergeSort(int[]arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        //find mid
        int mid = (low+high)/2;
        //recursion
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        //merge both halves
        merge(arr,low,mid,high);


    }
    static void merge(int[]arr,int low,int mid,int high)
    {
        int[]temp = new int[high-low+1];
        int left =low;
        int right=mid+1;
        int k=0;
        //compare both halves
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
               temp[k]=arr[left];
               left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
         //remaining elements from left half
        while(left<=mid)
        {
              temp[k]=arr[left];
              left++;
              k++;
        }
        //remaining elements from right half
         while(right<=high)
        {
              temp[k]=arr[right];
              right++;
              k++;
        }
        //copy to original array
        for(int i=0;i<temp.length;i++)
        {
            arr[low+i]=temp[i];
        }
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
        System.out.println();
        MergeSort(arr, 0, n-1);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        sc.close();
    }
    
}
