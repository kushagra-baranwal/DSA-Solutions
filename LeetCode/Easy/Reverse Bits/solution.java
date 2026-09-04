class Solution {
    public int reverseBits(int n) {
        int num=0,i=0;
        while(n>0)
        {
            num += n%2*Math.pow(2,31-i);
            i++;
            n/=2;
        }
        return num;
    }
}