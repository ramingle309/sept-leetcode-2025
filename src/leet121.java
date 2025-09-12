public class leet121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int low=prices[0];
        int max_profit=0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]<low){
                low=prices[i];
            }
            if (max_profit<prices[i]-low){
                max_profit=prices[i]-low;
            }
        }
        return max_profit;
    }

    //gpt
    public static int maxProfit1(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int max_profit=0;
        for (int price:prices) {
            minPrice=Math.min(minPrice,price);
            max_profit=Math.max(max_profit,price-minPrice);
        }
        return max_profit;
    }
}
