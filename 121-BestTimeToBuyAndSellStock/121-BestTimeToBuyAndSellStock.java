// Last updated: 9/16/2025, 9:34:06 AM
class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int best_buy=prices[0];
        for(int i=1; i<prices.length;i++){
            if(prices[i]>best_buy){
                mp=Math.max(mp,prices[i]-best_buy);
            }
            best_buy=Math.min(best_buy,prices[i]); 
        }
        return mp;
        
    }
}