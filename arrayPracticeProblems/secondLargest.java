package arrayPracticeProblems;

public class secondLargest {
    public static void main(String[] args) {
         int arr[]={1,5,8,9,4,6};
        int largest =0;
        int sLargest=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
for(int i=0;i<arr.length;i++)
{
    if(arr[i]>sLargest&& arr[i]!=largest)
    {
        sLargest=arr[i];
    }
}
System.out.println("second largest num is: "+sLargest);
    }
}
