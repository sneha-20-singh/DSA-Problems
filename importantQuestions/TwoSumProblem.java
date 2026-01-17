package importantQuestions;

import java.util.*;
public class TwoSumProblem {
    public static boolean twoSum(int[]nums,int target)
    {
      Arrays.sort(nums);
      int left =0;
      int right = nums.length-1;
     while(left<right)
     {
        int sum = nums[left] + nums[right];
        if(sum == target)
        {
            return true;
        }
        else if (sum<target)
        {
            left++;
        }
        else{
            right--;
        }
     }
     return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        if(twoSum(nums, target))
        {
            System.out.println("Yes,pair exists");
        }
        else{
            System.out.println("NO, pair does not exist");
        }
        sc.close();
    }
}
