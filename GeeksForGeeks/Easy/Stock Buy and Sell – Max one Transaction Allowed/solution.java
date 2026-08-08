class Solution {
    public int maxProfit(int[] prices) {
                int p=0;
        int b=0,j;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]>prices[b]){
                continue;
            }
            b=i;
            for(j=i+1; j<prices.length;j++)
            {
                if(prices[i]<prices[j] && (prices[j]-prices[i])>p)
                {
                    p=prices[j]-prices[i];
                }
            }
        }
        return p;
    }
}