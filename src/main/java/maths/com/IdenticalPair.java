package maths.com;

import java.util.HashMap;
import java.util.Map;

public class IdenticalPair {
    /*
               Instead of checking every pair:

            👉 Count frequency of each number
            👉 If a number appears f times:

            number of pairs = f * (f - 1) / 2
     */
    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            int freq = map.getOrDefault(num, 0);
            count += freq;
            map.put(num, freq + 1);
        }
        return count;
    }

    public int numIdenticalPairs2(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length - 1; i++){
            for(int j = i + 1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        /*
        Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
         */
    }
}
