class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        int i=0;
        StringBuffer sb = new StringBuffer(s);
        while(i<s.length())
        {
            if(sb.toString().equals(goal))
            {
                return true;
            }
            char ch = s.charAt(s.length()-i-1);
            sb.deleteCharAt(sb.length()-1);
            sb.insert(0,ch);
            i++;
        }
        return false;
    }
}
