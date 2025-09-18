import java.util.HashMap;
import java.util.Map;

public class leet219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 3;
        System.out.println(containsNearbyDuplicate1(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])){
                int preIndex= map.get(nums[i]);
                if (i-preIndex<=k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;

    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i]) && i- map.get(nums[i])<=k){
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <k ; i++) {
            if (map.containsKey(nums[i])){
                int preIndex= map.get(nums[i]);
                if (i-preIndex<=k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        for (int i = k; i < nums.length ; i++) {
            if (map.containsKey(nums[i])){
                int preIndex= map.get(nums[i]);
                if (i-preIndex<=k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
