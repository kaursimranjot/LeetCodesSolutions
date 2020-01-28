/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1*/
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                i=i+1;
            else
                return nums[i];
        }
        return nums[i];
    }
}
