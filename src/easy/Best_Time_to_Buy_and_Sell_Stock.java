package easy;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        if (prices.length==0)return 0;
        int min =10000,ans=0;
        for (int i = 0; i < prices.length; i++) {
            ans=max(ans,prices[i]-min);
            min=min(min,prices[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock b = new Best_Time_to_Buy_and_Sell_Stock();
        System.out.println(b.maxProfit(new int[]{0,1}));
    }
}
