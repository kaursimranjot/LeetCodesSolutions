/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5*/
class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int lastlength=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(length>0)
                lastlength=length;
                length=0;
                continue;
            }
            else if(s.charAt(i)!=' ')
                length++;
        }
        if(length==0)
        return lastlength;
        else 
            return length;
    }
}