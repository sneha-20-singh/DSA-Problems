package arrayPracticeProblems;

public class missingNumber {
    public static void main(String[] args) {
      
      int[] arr = {1,3,4,5};
      int n = arr.length+1;
      //SUM LOGIC
      /* 
     int Expectedsum=(n*(n+1))/2;
     int actualSum=0;
      for(int i=0;i<arr.length;i++)
{
    actualSum=actualSum+arr[i];
}
int missingNumber = Expectedsum-actualSum;
System.out.println("Missing number is : "+missingNumber);
*/

// XOR LOGIC 
int xor =0;
for(int i=0;i<=n;i++)
{
    xor^=i;
}
for(int i=0;i<arr.length;i++)
{
    xor^=arr[i];
}
System.out.println("missing Number is : "+xor);
    }
}
/*
 why I used xor?
 because using the sum logic there are chances of "OVERFLOW"
 */

