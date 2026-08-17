import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxlen=0, len=0;
        if(nums.length==0)
        return 0;
        for(int i=0; i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i]+1)
            {
                len++;
            }
            else
            {   
                if(nums[i+1]==nums[i])
                {
                continue;
                }
                maxlen = Math.max(len,maxlen);
                len=0;
            }
        } 
        return Math.max(len,maxlen)+1;       
    }
}