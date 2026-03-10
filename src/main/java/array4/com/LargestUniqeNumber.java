package array4.com;

import java.util.HashMap;
import java.util.*;

public class LargestUniqeNumber {
    public static int largestUniqueNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+ 1);
        }
        int largestUnique = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                largestUnique = Math.max(largestUnique, entry.getKey());
            }
        }
        return largestUnique;
    }
    public  static  void  main(String args[]){
        int arr[] = {5,7,3,9,4,9,8,3,1};
        int arr1[] = {1,4,5,7,8,8};
        int arr2[] = {8,8,9,9};
        System.out.println(largestUniqueNumber(arr));
        System.out.println(largestUniqueNumber(arr1));
        System.out.println(largestUniqueNumber(arr2));
        /*
        Problem: Largest Unique Number

Given an integer array nums, return the largest integer that occurs exactly once in the array.

If no integer occurs exactly once, return -1.

Example 1

Input

nums = [5,7,3,9,4,9,8,3,1]

Output

8

Explanation

Frequency of numbers:

5 -> 1
7 -> 1
3 -> 2
9 -> 2
4 -> 1
8 -> 1
1 -> 1

Unique numbers are:

1,4,5,7,8

Largest unique number = 8

Example 2

Input

nums = [9,9,8,8]

Output

-1

Explanation

All numbers appear more than once, so answer is -1.

Constraints
1 <= nums.length <= 2000
0 <= nums[i] <= 1000
         */
    }
}
