package arrayPracticeProblems;

public class sumOfElements {
    public static void main(String[] args) {
        int arr[]={1,5,8,9,4};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of all elements of array are: "+sum);
    }
}
