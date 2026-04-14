package array5.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestHormonicSeq {
    public static int LHS(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     int key  = entry.getKey();
        //     if(map.containsKey(key+ 1)){
        //         maxLen = Math.max(maxLen , map.get(key) + map.get(key + 1));
        //     }
        // }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, map.get(key) + map.get(key + 1));
            }
        }
        return maxLen;
    }

    //handle only given test case 3 not handle like this
//    [-3,-1,-1,-1,-3,-2]    o/p is 4
    public int findLHS2(int[] nums) {
        int maxLen = 0;
        for(int i =0; i<nums.length; i++){
            int max = nums[i];
            int min = nums[i];
            List<Integer> l = new ArrayList<>();
            l.add(nums[i]);
            for(int j =i+1; j<nums.length;j++){
                int num = nums[j];
                int newMax = Math.max(max, num);
                int newMin = Math.min(min, num);
                if(newMax - newMin == 1){
                    l.add(num);
                    max = newMax;
                    min = newMin;
                }
            }
            System.out.println(l);
            if(l.size()>=2)
                maxLen = Math.max(maxLen , l.size());
        }
        return maxLen;
    }
    public static void main(String args[]){
        /*
        We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

        Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.



        Example 1:

        Input: nums = [1,3,2,2,5,2,3,7]

        Output: 5

        Explanation:

        The longest harmonious subsequence is [3,2,2,2,3].

        Example 2:

        Input: nums = [1,2,3,4]

        Output: 2

        Explanation:

        The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

        Example 3:

        Input: nums = [1,1,1,1]

        Output: 0
         */
    }
}
