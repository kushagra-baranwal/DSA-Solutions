class Solution {
    public int maxArea(int[] h) {
        int i=0, j=h.length-1;
        int area=0;
        while(i<j)
        {
            area = Math.max(Math.min(h[i],h[j])*(j-i),area);
            if(h[i]<h[j])
            i++;
            else
            j--;
        }
        return area;
    }
}