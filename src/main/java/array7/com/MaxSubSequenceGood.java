package array7.com;

import java.util.Arrays;
import java.util.Comparator;

public class MaxSubSequenceGood {
    public static int[] maxSubSequence(int[] nums, int k) {
        int arr[][] = new int[nums.length][2];
        for(int i =0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        //sort array based on value descending
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        int selected[][] = Arrays.copyOf(arr, k);

        //restore original order
        Arrays.sort(selected, (a,b) -> Integer.compare(a[1], b[1]));

        int result[] = new int[k];
        for(int i =0; i<k; i++){
            result[i] = selected[i][0];
        }
        for(int i : result){
            System.out.print(i+" ");
        }
        return result;
    }
    public static int[] maxSubSequence1(int nums[], int k){
        int arr[][] = new int[nums.length][2];
        for(int i = 0; i<nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        //sort arr descending order
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        int selected[][] = Arrays.copyOf(arr, k);

        //sort in based on indexing order
//        Arrays.sort(selected, (a, b) -> Integer.compare(a[1], b[1]));
        Arrays.sort(selected, Comparator.comparingInt(a -> a[1]));

        int result[] = new int[k];
        for(int i =0; i<k; i++){
            result[i] = selected[i][0];
        }
        for(int i : result){
            System.out.print(i+" ");
        }
        return result;
    }
    public static void main(String args[]){
        int arr[] = {2,1,3,3};
        maxSubSequence(arr, 2);
        System.out.println("");
        int arr1[] = {-1,-2,3,4};
        maxSubSequence(arr1, 3);
        System.out.println("");
        int arr2[] = {3,4,3,3,6,7,11,23,34,89,45,1,-23,-45,55,7,34,55,78,87,-34,-56,98,73,82};
        maxSubSequence(arr2, 7);
        /*
        ou are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
        Return any such subsequence as an integer array of length k.
        A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
        Example 1:

        Input: nums = [2,1,3,3], k = 2
        Output: [3,3]
        Explanation:
        The subsequence has the largest sum of 3 + 3 = 6.
        Example 2:

        Input: nums = [-1,-2,3,4], k = 3
        Output: [-1,3,4]
        Explanation:
        The subsequence has the largest sum of -1 + 3 + 4 = 6.
        Example 3:

        Input: nums = [3,4,3,3], k = 2
        Output: [3,4]
        Explanation:
        The subsequence has the largest sum of 3 + 4 = 7.
        Another possible subsequence is [4, 3].
         */
    }
}
