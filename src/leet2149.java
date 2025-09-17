public class leet2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(rearrangeArray1(nums));

    }
    public static int[] rearrangeArray(int[] nums) {
        int positive_ptr=0;
        int negative_ptr=1;
        int x=nums.length;
        while (positive_ptr < x && negative_ptr < x ){
            if (nums[positive_ptr]>0){
                positive_ptr+=2;
            }
            if (nums[negative_ptr]<0){
                negative_ptr+=2;
            }
            if(nums[positive_ptr]<0 && nums[negative_ptr]>0){
                int temp=nums[positive_ptr];
                nums[positive_ptr]=nums[negative_ptr];
                nums[negative_ptr]=temp;
            }
        }
        return nums;
    }

    public static int[] rearrangeArray1(int[] nums) {
        int[] ans =new int[nums.length];
        int pos=0;
        int neg=1;
        for (int num:nums){
            if (num>0){
                ans[pos]=num;
                pos+=2;
            }else {
                ans[neg]=num;
                neg+=2;
            }
        }
        return ans;
    }
}
