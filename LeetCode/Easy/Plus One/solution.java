class Solution {
    public int[] plusOne(int[] digits) {
        int i,c=0;
        int[] ans = new int[digits.length+1];

        digits[digits.length-1]++;
        if(digits[digits.length-1]==10)
        {
            digits[digits.length-1]=0;
            c=1;
        }
        ans[digits.length]=digits[digits.length-1];
        for (i=digits.length-2; i>=0; i--)
        {   
            if(c==1)
            {
                digits[i]+=c;
                c=0;
            }
            if(digits[i]==10)
            {
                digits[i]=0;
                c=1;
            }
            ans[i+1]=digits[i];
        }
        if(c==1)
        {   
            ans[0]=1;
            return ans;
        }
        else
        {
            return digits;
        }
    }
}