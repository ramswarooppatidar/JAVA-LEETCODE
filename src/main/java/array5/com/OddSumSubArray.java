package array5.com;

import java.util.ArrayList;
import java.util.List;

public class OddSumSubArray {
    public static int oddSumSunArray(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            int currSum = 0;
            for(int j = i; j<n; j++){
                currSum += arr[j];
                int len = j - i + 1;
                if(len % 2 == 1){
                    sum += currSum;
                }
            }
        }
        return sum;
    }
    public static List<List<Integer>> oddSumSunArray2(int arr[]){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for(int i =0; i<n ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = i; j<n; j++){
                list.add(arr[j]);
                int len = j - i + 1;
                if(len % 2 == 1){
                    result.add(new ArrayList<>(list));
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int [] arr = {1,4,2,5,3};
        System.out.println(oddSumSunArray(arr));
        System.out.println(oddSumSunArray2(arr));
        /*
        Given an array of positive integers arr, return the sum of all possible odd-length
        subarrays of arr. A subarray is a contiguous subsequence of the array.
        Example 1:
        Input: arr = [1,4,2,5,3]
        Output: 58
        Explanation: The odd-length subarrays of arr and their sums are:
        [1] = 1
        [4] = 4
        [2] = 2
        [5] = 5
        [3] = 3
        [1,4,2] = 7
        [4,2,5] = 11
        [2,5,3] = 10
        [1,4,2,5,3] = 15
        If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
        Example 2:

        Input: arr = [1,2]
        Output: 3
        Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
        Example 3:

        Input: arr = [10,11,12]
        Output: 66
         */
    }
}
