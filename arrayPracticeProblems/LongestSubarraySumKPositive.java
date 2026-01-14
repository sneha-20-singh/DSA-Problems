package arrayPracticeProblems;

public class LongestSubarraySumKPositive {
    public static void main(String[] args) {
        int[]arr ={1,2,3,1,1,1,1,3};
        int k= 6;
        int left = 0;
        int sum=0,maxLen=0;
        for(int right =0;right<arr.length;right++)
        {
            sum=sum+arr[right];
            while(sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
            if(sum == k)
            {
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        System.out.println("Longest Subarray Length: "+maxLen);
    }
}
