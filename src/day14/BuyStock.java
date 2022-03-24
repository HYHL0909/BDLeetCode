package day14;

public class BuyStock {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_price=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min_price=prices[i]<min_price?prices[i]:min_price;
            int temp=prices[i]-min_price;
            if(temp>max_profit)
                max_profit=temp;
        }
        return max_profit;
    }
}
