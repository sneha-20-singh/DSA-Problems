package arrayPracticeProblems;

public class evenOddCount {
    public static void main(String[] args) {
        int evenCount=0;
        int oddCount=0;
        int arr[]={1,2,4,5,6,6,8,7};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("No of even elements are: "+evenCount);
        System.out.println("No of odd elements are: "+oddCount);
    }
}
