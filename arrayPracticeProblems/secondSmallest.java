package arrayPracticeProblems;

public class secondSmallest {
    public static void main(String[] args) {
        int arr[]={4,6,9,7,8,2};
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                sSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i] != smallest && arr[i]<sSmallest)
            {
                sSmallest=arr[i];
            }
        }
        System.out.println(sSmallest);
        
    }
}
