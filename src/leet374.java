public class leet374 {
    public static void main(String[] args) {
        int n=34;
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {
        int low=0;
        int high=n;

        while (low<=high){
            int mid = low + (high - low) / 2; // avoid overflow
            int res = guess(mid);

            if (res==0){
                return mid;
            }
            if (res==-1){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;

    }
}
