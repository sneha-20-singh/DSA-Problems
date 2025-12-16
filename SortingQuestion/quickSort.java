package SortingQuestion;

import java.util.Scanner;

public class quickSort {
static void QuickSort(int[] arr,int low ,int high)
{
    if(low<high)
    {
        int pIndex = partition(arr,low,high);
        QuickSort(arr, low, pIndex-1);
        QuickSort(arr, pIndex+1, high);
    }
}
static int partition(int[] arr,int low,int high)
{
    int pivot = arr[low];
    int i=low;
    int j=high;
    while(i<j)
    {
        while(arr[i]<= pivot && i<=high-1)
        {
            i++;
        }
        while(arr[j]>pivot && j>=low+1)
        {
            j--;
        }
        if(i<j)
        {
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
        }
    }
    int temp=arr[low];
    arr[low]=arr[j];
    arr[j]=temp;
    return j;
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
        QuickSort(arr, 0, n-1);
        for(int x: arr)
        {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
