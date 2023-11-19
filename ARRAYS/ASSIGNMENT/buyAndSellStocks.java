package ASSIGNMENT;

public class buyAndSellStocks {
    public static int buy_and_sell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println("Maimum profit earned is: " + buy_and_sell(prices));
    }
}