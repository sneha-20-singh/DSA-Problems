package importantQuestions;

public class majorityElementOptimal {
    public static int majorityElemnet(int[] nums)
    {
        int candidate =0;
        int count =0;
        for(int num:nums)
        {
            if(count == 0)
            {
                candidate=num;
            }
            if(num==candidate)
            {
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int result = majorityElemnet(arr);
        System.out.println("Majority Element: "+result);
    }
}
