

public class buysell {
    public static void main(String[] args) {
        int[]prices = {7,7,7,7,7};
       buysell obj = new buysell();
        System.out.println(obj.maxProfit(prices));
    }


    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            if (prices[i]<minPrice) {
                minPrice=prices[i];//buy
            }
            else {
                maxProfit= Math.max(maxProfit, prices[i]-minPrice);
            }
            
        }
        return maxProfit;
       
    }
}
