package leetcode.medium.array;

import java.util.HashMap;

public class Triplets {
    public static int triplets(int arr1[], int arr2[]){
        return count(arr1, arr2) +count(arr2, arr1);
    }
    private static int count(int arr1[], int []arr2){
        int res = 0;
        for(long x : arr1){
            long target = x * x;
            HashMap<Long,Integer> map = new HashMap<>();
            for(long y : arr2){
                if(target % y == 0){
                    long need = target/y;
                    res += map.getOrDefault(need , 0);
                }
                map.put(y, map.getOrDefault(y, 0) + 1);
            }

        }
        return res;
    }

    public static void main(String args[]){
        /*
        Example 1:

        Input: nums1 = [7,4], nums2 = [5,2,8,9]
        Output: 1
        Explanation: Type 1: (1, 1, 2), nums1[1]2 = nums2[1] * nums2[2]. (42 = 2 * 8).
        Example 2:

        Input: nums1 = [1,1], nums2 = [1,1,1]
        Output: 9
        Explanation: All Triplets are valid, because 12 = 1 * 1.
        Type 1: (0,0,1), (0,0,2), (0,1,2), (1,0,1), (1,0,2), (1,1,2).  nums1[i]2 = nums2[j] * nums2[k].
        Type 2: (0,0,1), (1,0,1), (2,0,1). nums2[i]2 = nums1[j] * nums1[k].
        Example 3:

        Input: nums1 = [7,7,8,3], nums2 = [1,2,9,7]
        Output: 2
        Explanation: There are 2 valid triplets.
        Type 1: (3,0,2).  nums1[3]2 = nums2[0] * nums2[2].
        Type 2: (3,0,1).  nums2[3]2 = nums1[0] * nums1[1].
         */
    }
}
