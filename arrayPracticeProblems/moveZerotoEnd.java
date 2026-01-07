
package arrayPracticeProblems;

public class moveZerotoEnd {
    public static void main(String[] args) {
        int [] arr = {1,4,7,0,2,0,4,5,0,6,0,0,1,8};
        int n= arr.length;
        int j = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]== 0)
            {
                j=i;
                break;
            }
        }
         if(j == -1) 
            {
                for(int i=0;i<n;i++)
                {
                    System.out.println(arr[i]+" ");
                }
                System.out.println("no zero found");
                return;
            }
                
        for(int i=j+1;i<n;i++)
        {
          if(arr[i]!= 0)
          {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }
        //after moving the array
        for(int i=0;i<n;i++)
{
    System.out.print(arr[i]+" ");
}

}
}

