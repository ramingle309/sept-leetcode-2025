import java.util.*;

// not completed yet


public class leet15 {
    public static void main(String[] args) {
        int[] nums = {0,1,1};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0]>1){
            return list;
        }
        for (int i = 0; i < nums.length-2 ; i++) {
            while (contains_twoSum(Arrays.copyOfRange(nums,i+1,nums.length),-nums[i])){
                int[] twoSum=twoSum(Arrays.copyOfRange(nums,i+1,nums.length),-nums[i]);
                List<Integer> aa=new ArrayList<>();
                aa.add(nums[i]);
                aa.add(twoSum[0]);
                aa.add(twoSum[1]);
                list.add(aa);
            }
        }

        return list;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if (map.containsKey(complement)){
                ans[0]=nums[map.get(complement)];
                ans[1]=nums[i];
                return ans;

            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

    public static boolean contains_twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if (map.containsKey(complement)){
                ans[0]=map.get(complement);
                ans[1]=i;
                return true;

            }
            map.put(nums[i],i);
        }
        return false;
    }
}
