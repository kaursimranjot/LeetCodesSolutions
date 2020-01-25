/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(target>nums[i])
                pos=i+1;
            else if(target==nums[i])
                pos=i;
        }
        if(pos==0 &&nums[nums.length-1]<target)
        return nums.length;
        else
            return pos;
    }
}