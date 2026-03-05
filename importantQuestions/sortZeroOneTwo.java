package importantQuestions;
import java.util.*;
public class sortZeroOneTwo {
    public void SortZeroOneTwo(int[] nums)
    {
        int low =0,mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int[] nums = {1,2,0,1,2,0};
       sortZeroOneTwo obj=new sortZeroOneTwo();
       obj.SortZeroOneTwo(nums);
       for(int num:nums)
       {
        System.out.print(num+" ");
       }
       sc.close();
    }
    
}
