package arrayPracticeProblems;
import java.util.HashMap;
import java.util.Scanner;

public class countingFrequencies {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n= sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elemnts of array: ");  
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    //pre compute
    //this works for all values 
    /*
    first integer stores = the key(the number from the array)
    second integer stores = value(how many times the nunber appears)
     */
   HashMap<Integer, Integer> hash = new HashMap<>();
    for(int i=0;i<n;i++)
    {
        //getOrDefault = current count OR 0 if not present
       hash.put(arr[i],hash.getOrDefault(arr[i],0)+1); 
    }
    System.out.println("enter the number of numbers to be searched");
    int query = sc.nextInt();
    for(int i=0;i<query;i++)
    {
        System.out.println("enter the number: ");
        int number=sc.nextInt();
        //fetch the numbers from the hash array
        //if number exists print count  if not prints 0
        System.out.println("No of times it appears = "+hash.getOrDefault(number,0));
    }
    sc.close();
    }
   
}
