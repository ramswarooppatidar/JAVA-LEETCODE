package array5.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] arr) {
        int sorted[] = arr.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> map = new HashMap<>();
        int res[] = new int[arr.length];
        int rank =0;
        for(int num : sorted){
            if(!map.containsKey(num)){
                map.put(num, rank++);
            }else{
                rank++;
            }
        }
        for(int i =0; i<arr.length; i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
    public static int[] smallerNumbersThanCurrent2(int[] arr) {
        int freq[] = new int[101];
         for(int i : arr){
             freq[i]++;
         }

         //prefix sum
        for(int i =1; i<101; i++){
            freq[i] = freq[i] + freq[i -1];
        }
        int res[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                res[i] = 0;
            }else{
                res[i] = freq[arr[i] - 1];
            }
        }
        return res;
    }
    public static void main(String args[]){
        int  nums[] = {8,1,2,2,3};
        int res[] = smallerNumbersThanCurrent(nums);
        for(int i : res){
            System.out.print(i+" ");
        }
        /*
        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

        Return the answer in an array.



        Example 1:

        Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
        Explanation:
        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        For nums[1]=1 does not exist any smaller number than it.
        For nums[2]=2 there exist one smaller number than it (1).
        For nums[3]=2 there exist one smaller number than it (1).
        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
        Example 2:

        Input: nums = [6,5,4,8]
        Output: [2,1,0,3]
        Example 3:

        Input: nums = [7,7,7,7]
        Output: [0,0,0,0]

         */
    }
}
