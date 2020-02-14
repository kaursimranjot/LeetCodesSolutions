/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3*/
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> count= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i]))
                count.replace(nums[i],count.get(nums[i]),count.get(nums[i])+1);
            else
                count.put(nums[i],1);
        }
        int maxKey=0;
        int maxValue=0;
        for(Map.Entry m: count.entrySet()){
            if(maxValue<(int)m.getValue()){
                maxValue=(int)m.getValue();
                maxKey=(int)m.getKey();
            }
        }
        return maxKey;
    }
}
