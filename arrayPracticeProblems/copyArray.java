package arrayPracticeProblems;

public class copyArray {
    public static void main(String[] args) {
         int arr[]={1,2,4,5,6,6,8,7};
         int arr2[]=new int[arr.length];
         
         for(int i=0;i<arr.length;i++)
         {
            arr2[i]=arr[i];
         }
         System.out.println("Copied array: ");
         for(int i =0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }
            
         //using System.arraycopy()
         System.arraycopy(arr, 0, arr2,0,arr.length);
         System.out.println("Copied array: ");
         for(int i =0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
}
