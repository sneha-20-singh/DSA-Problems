package arrayPracticeProblems;

import java.util.ArrayList;
import java.util.List;

public class unionOfTwoSortedArray {
    public static List<Integer> union(int[]a,int[]b)
    {
         int i=0,j=0;
         List<Integer> result = new ArrayList<>();
         while(i<a.length && j<b.length)
         {
            //skip duplicates in array a
            if(i>0 && a[i] == a[i-1])
            {
                i++;
                continue;
            }
            //skip duplicates in array a
             if(j>0 && b[j] == b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
            {
                result.add(a[i]);
                i++;
            }
            else if(a[i]>b[j])
            {
                result.add(b[j]);
                j++;
            }
            else{
              result.add(a[i]);
              i++;
              j++;
            }
         }
         //remaining elements of a
         while(i<a.length)
         {
            if(i==0 || a[i] != a[i-1])
            {
                result.add(a[i]);
            }
            i++;
         }
           //remaining elements of a
         while(j<b.length)
         {
            if(j==0 || b[j] != b[j-1])
            {
                result.add(b[j]);
            }
            j++;
         }

return result;
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,5};
        int[] b= {2,3,4,4,6};
        System.out.println(union(a, b));
    }
}
