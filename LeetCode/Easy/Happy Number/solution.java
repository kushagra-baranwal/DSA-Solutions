class Solution {
    int sumOfSquares(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

    while (n != 1 && !seen.contains(n)) {
         seen.add(n);
          n = sumOfSquares(n);
    }
    return n == 1;
    }
}