/*Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2*/
class Solution {
    public int mySqrt(int x) {
        double res=0;
        if(x==1)
            return 1;
        else{
            res=Math.sqrt(x);
            return (int)Math.floor(res);
        }
    }
}