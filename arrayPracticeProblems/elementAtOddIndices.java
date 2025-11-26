package arrayPracticeProblems;

public class elementAtOddIndices {
    public static void main(String[] args) {
         int arr[]={1,3,6,7,3,9,6,3,4};
        for(int i=1;i<=arr.length;i++)
        {
            if(i%2!=0)
            {
                System.out.println(arr[i]+" ");
            }
        } 
    }
}
