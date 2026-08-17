class Solution {
    public int trap(int[] h) {
        int w=0;
        int l=0,r=h.length-1;
        int maxl=0, maxr=0;
        while(l<=r){
            if(h[l]>=h[r])
            {
                if(h[r]>=maxr)
                maxr=h[r];
                else
                w+=maxr-h[r];
                r--;
            }
            else
            {
                if(h[l]>=maxl)
                maxl=h[l];
                else
                w+=maxl-h[l];
                l++;
            }

        }       
        return w;
    }
}