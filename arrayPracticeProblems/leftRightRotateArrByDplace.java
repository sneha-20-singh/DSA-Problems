package arrayPracticeProblems;
import java.util.*;
public class leftRightRotateArrByDplace {
    static void reverseArray(int arr[],int start ,int end)
    {
      //swap elements until start meets end
      while(start<end)
      {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
    }
    //Function to rotate left or right by D steps
    static void rotateArray(int[] arr,int d,String direction)
    {
      int n=arr.length;
      //edge case do nothing if n or d is empty
      if(n==0||d==0)
      {
        return;
      }
      //if d is greater than n
      d=d%n;
      //If rotation is to the right
      if(direction.equals("right"))
      {
        //reverse entire array
        reverseArray(arr,0,n-1);
        //reverse first d elements
        reverseArray(arr, 0,d-1);
        //reverse remaining n-d elements
        reverseArray(arr, d,n-1);
      }
      else if(direction.equals("left"))
      {
        //reverse first k elements
        reverseArray(arr, 0,d-1);
         //reverse remaining n-d elements
        reverseArray(arr, d,n-1);
        //reverse entire array
        reverseArray(arr,0,n-1);
        
      }
      else{
        System.out.println("Invalid Direction");
      }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter d");
        int d=sc.nextInt();
        System.out.println("enter the direction (left/right)");
        String direction = sc.next();
        //call rotate array and store result
        rotateArray(arr, d, direction);
          System.out.println(Arrays.toString(arr));  
sc.close();
    }
    
}
