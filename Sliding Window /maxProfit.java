// class Solution {
//     public int maxProfit(int[] prices) {

//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (buyPrice < prices[i]) {// profit
//                 int profit = prices[i] - buyPrice;// today's profit
//                 maxProfit = Math.max(maxProfit, profit);

//             } else {
//                 buyPrice = prices[i];

//             }
//         }
//         return maxProfit; //o(n)
//     }

    
// }
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int len = prices.length;
        int maxPro = 0;
        for (int r=0; r<len; r++){
            if (prices[l]<prices[r]){
                maxPro = Math.max(maxPro, (prices[r]-prices[l]));
            }else{
                l = r;
            }
        }
        return maxPro;
    }
}
