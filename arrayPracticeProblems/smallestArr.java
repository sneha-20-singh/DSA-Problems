package arrayPracticeProblems;

public class smallestArr {
    public static void main(String[] args) {
        int arr[]={9,4,6,8,3};
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element in array are: "+smallest);
    }
}
