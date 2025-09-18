import java.util.HashMap;
import java.util.Map;

public class leet1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums,target).toString());
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if (map.containsKey(complement)){
                ans[0]=map.get(complement);
                ans[1]=i;
                return ans;

            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};

    }
}
