package SortingQuestion;

import java.util.Scanner;

public class recursiveInsertionSort {
    static void insertionSort(int[]arr,int n)
    {
    //base case
    if(n>=1)
    {
        return;
    }
    //sort first n-1 elements
    insertionSort(arr,n-1);
    int key =arr[n-1];
    int j=n-2;
    while(j>=0 && arr[j]>key)
    {
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=key;
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
        System.out.println("array elements after sorting");
        insertionSort(arr,arr.length);
        for(int x:arr)
        {
            System.out.println(x+" ");
        }
        sc.close();
    }
}
