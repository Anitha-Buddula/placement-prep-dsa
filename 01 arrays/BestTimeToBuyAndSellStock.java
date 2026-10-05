class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int MaxProfit=0;
        while (r<prices.length){
            if (prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                MaxProfit=Math.max(MaxProfit,profit);
            } else {
                l=r;
            }
            r++;
        }
        return MaxProfit;
    }
}