/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false*/
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)
            return true;
        else{
            s=s.toUpperCase();
            int last=s.length()-1;
            int first=0;
            while(first<last){
                if(((int)s.charAt(first)<48 || (int)s.charAt(first) >57) &&((int)s.charAt(first)<65 || (int)s.charAt(first)>90)){
                    ++first;
                    continue;
                }
                if(((int)s.charAt(last)<48 || (int)s.charAt(last) >57) && ((int)s.charAt(last)<65 || (int)s.charAt(last)>90)){
                    --last;  
                    continue;
                }
                if(s.charAt(first)==s.charAt(last)){
                    ++first;
                    --last;
                }
                else
                    return false;
            }
            return true;
        }
    }
}
