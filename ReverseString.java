//151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        Stack<String> str = new Stack<String>();
        int i=0;
        while(i<s.length())
        {
            String st="";
            while(i<s.length() && s.charAt(i) != ' ')
            {
                st+=s.charAt(i);
                i++;
            }
            str.push(st);
            i++;
        }
        Collections.reverse(str);
        String string="";
        for(String a:str)
        {
            string+=a;
            string+=" ";
        }
        String string1=string.replaceAll("\\s+", " ");
        return string1.trim();
    }
}
