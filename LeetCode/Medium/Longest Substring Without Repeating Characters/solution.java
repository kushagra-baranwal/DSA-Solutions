class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        String ss="",ssm="";
        while(i<s.length())
        {
            if(ss.indexOf(s.charAt(i))<0)
            {
                ss = ss+s.charAt(i);
                i++;
            }
            else
            {   
                j=ss.indexOf(s.charAt(i))+1+j;
                i=j;
                if(ssm.length()<ss.length())
                ssm=ss;
                ss="";
            }
        }
        if(ssm.length()<ss.length())
                ssm=ss;
        return ssm.length();
    }
}