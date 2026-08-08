import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        int offset = 10000;
        int freq[] = new int[20001];
        for(int num:nums)
        {
            freq[num+offset]++;
        }

        int index=0;
        for(int i = nums.length; i>0 && index<k; i--)
        {
            for(int j=0; j<freq.length && index<k; j++)
            {
                if(freq[j]==i)
                ans[index++]=j-offset;
            }
        }
        return ans;
    }
}