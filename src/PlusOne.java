/*Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.*/
class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int num=0;
        for(int i=digits.length-1;i>=0;i--){
            if(i==digits.length-1)
                num=digits[i]+carry+1;
            else{
                num=digits[i]+carry;
                carry=0;
            }
            if(num>9){
                digits[i]=num%10;
                carry=num/10;
            }
            else
                digits[i]=num;
        }
        int[] res=new int[digits.length+1];
        if(carry>0){
            int i=0;
            res[i]=carry;
            for(i=1;i<res.length;i++){
                res[i]=digits[i-1];
            }
            return res;
        }
        return digits;
    }
}
