class Solution {
    static boolean isAlphanumeric(char c)
    {
        if( ('a'<= c && 'z'>= c) || ('0'<= c && '9'>=c))
            return true;
        else
            return false;
    }
    public boolean isPalindrome(String s) 
    {
        int left=0, right=s.length()-1;
        s = s.toLowerCase();
        while(left<right)
        {   
            while(!isAlphanumeric(s.charAt(left))&&left<right)
            {
                left++;
            }
            while(!isAlphanumeric(s.charAt(right))&&left<right)
            {
                right--;
            }
            if(s.charAt(left)!=s.charAt(right))
            return false;
            right--;
            left++;
        }
        return true;
    }
}