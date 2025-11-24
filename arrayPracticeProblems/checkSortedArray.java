package arrayPracticeProblems;

public class checkSortedArray {
    public static void main(String[] args) {
      /*  int arr[]={4,8,2,1,9,3,4};*/
        int arr[]={1,2,3,4};
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>= arr[i+1])
            {
           sorted=false;
           break;
            }
            
        }
        if(sorted)
        {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
