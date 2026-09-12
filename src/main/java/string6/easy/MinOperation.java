package string6.easy;

public class MinOperation {
    public static int minOPeration(int nums[]){
        int increment = 0;
        for(int i =0; i<nums.length - 1; i++){
            if(nums[i + 1] <= nums[i]){
                int diff = nums[i] - nums[i + 1];
                nums[i + 1] = nums[i + 1] + diff + 1;
                increment += diff + 1;
            }
        }
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
        return increment;
    }
    public static void main(String args[]){
        int arr[]= {1,1,1};
        int arr2[] = {1,5,2,4,1};
        int arr3[] ={8};
        int arr4[] = {1,5,2,4,1,3,7,2,19,10,3,13,2,5,6,12,34,1,9,11};
        minOPeration(arr);
        minOPeration(arr2);
        minOPeration(arr3);
        minOPeration(arr4);
        /*
        You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.

        For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
        Return the minimum number of operations needed to make nums strictly increasing.

        An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1. An array of length 1 is trivially strictly increasing.



        Example 1:

        Input: nums = [1,1,1]
        Output: 3
        Explanation: You can do the following operations:
        1) Increment nums[2], so nums becomes [1,1,2].
        2) Increment nums[1], so nums becomes [1,2,2].
        3) Increment nums[2], so nums becomes [1,2,3].
        Example 2:

        Input: nums = [1,5,2,4,1]
        Output: 14
        Example 3:

        Input: nums = [8]
        Output: 0

         */
    }
}
