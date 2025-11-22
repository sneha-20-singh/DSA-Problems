package arrayPracticeProblems;

public class largestInArr {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,4};
        int largest =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("largest element is: "+largest);
    }
}
