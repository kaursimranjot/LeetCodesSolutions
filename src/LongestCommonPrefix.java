/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        if(strs.length>0)
        for(int i=0;i<strs[0].length();i++){
            char a=strs[0].charAt(i);
            int count=1;
            for(int j=1;j<strs.length;j++){
                if(i<=strs[j].length()-1){
                if(strs[j].charAt(i)==a)
                    count++;
                }
                else
                    break;
            }
            if(count==strs.length)
                res=res.concat(Character.toString(a));
            else break;
        }
        return res;
    }
}