//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/908407538/

class Solution {
    public int strStr(String haystack, String needle) {
        int k=needle.length();
        int ans=-1;
        for(int i=0;i<haystack.length()-k+1;i++)
        {
            String str="";
            for(int j=i;j<i+k;j++)
            {
                str+=haystack.charAt(j);
            }
            if(str.equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}
