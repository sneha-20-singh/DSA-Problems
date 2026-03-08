package importantQuestions;
import java.util.HashMap;
public class MajorityElement {
    public static int findMajority(int[] nums)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0 )+1);
        if(map.get(num)>nums.length/2)
        {
            return num;
        }
        }
        return -1; //if no majority element is present
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2,2};
        int result = findMajority(arr);
        if(result != -1)
        {
            System.out.println("Majority Element: "+result);
        }
        else{
            System.out.println("No Majority Element Present");
        }
    }
    
}
