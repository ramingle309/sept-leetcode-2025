import java.util.HashSet;

public class leet128 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        System.out.println(longestConsecutive(nums));

    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int larget=0;
        for (int num:set){
            if (!set.contains(num-1)){
                int current=num;
                int count=1;

                while (set.contains(current+1)){
                    count++;
                    current++;
                }

                larget=Math.max(count,larget);
            }
        }
        return larget;

    }
}
