/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true*/
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0)
                st.push(s.charAt(i));
            else if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                st.push(s.charAt(i));
            else {
                if(s.charAt(i)==')' && st.peek()=='(')
                    st.pop();
                else if(s.charAt(i)==']' && st.peek()=='[')
                    st.pop();
                else if(s.charAt(i)=='}' && st.peek()=='{')
                    st.pop();
                else
                    return false;
            }
        }
        if(st.size()==0)
            return true;
        else
            return false;
    }
}
