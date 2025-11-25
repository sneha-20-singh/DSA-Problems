package arrayPracticeProblems;

public class removeDuplicates {
    public static void main(String[] args) {
        // works in sorted array
        int arr[]={1,2,2,3,4,8,8,9};
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
              if(arr[i]!=arr[j])
              {
                arr[i+1]=arr[j];
                i++;
              }
        }
       int newLength =i+1;
       System.out.println("New Length : " + newLength);
       System.out.println("Array after removing duplicates");
       for(int k=0;k<newLength;k++)
       {
        System.out.println(arr[k]+" ");
       }
    }
}
