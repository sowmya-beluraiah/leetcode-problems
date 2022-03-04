class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        boolean bought=false;
        int boughtPrice=0;
        
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]<prices[i+1]){
                if(!bought){
                    bought=true;
                    boughtPrice=prices[i];
                }
            } else {
                if(bought){
                    bought=false;
                    res += prices[i] - boughtPrice;
                }
            }  
        }
        
        if(bought && boughtPrice < prices[prices.length-1]){
            res += prices[prices.length-1] - boughtPrice;
        }
        
        return res;
        
    }
}