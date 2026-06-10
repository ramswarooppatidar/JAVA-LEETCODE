package array6.com;

import java.util.HashMap;
import java.util.Map;

public class ArrayConcetinate {
    public static boolean isArrayConcetinate(int arr[], int pieces[][]){
        Map<Integer, Integer> index = new HashMap<>();
        int k =0;
        for(int i : arr){
            index.put(i, k++);
        }

        for(int[] x : pieces){
            if(x.length > 1){
                for(int i =0; i<x.length - 1; i++){
                    if(index.containsKey(x[i]) && index.containsKey(x[i + 1])){
                        if(index.get(x[i]) + 1 != index.get(x[i + 1])){
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }else{
                if(!index.containsKey(x[0])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int [] arr = {15,88};
        int[][] pieces = {{88},{15}};
        System.out.println(isArrayConcetinate(arr, pieces));

        int [] arr1 = {49,18,16};
        int[][] pieces1 = {{16,18,49}};
        System.out.println(isArrayConcetinate(arr1, pieces1));

        int [] arr2 = {91,4,64,78};
        int[][] pieces2 = {{78},{4,64},{91}};
        System.out.println(isArrayConcetinate(arr2, pieces2));

        int [] arr3 = {1, 2, 3};
        int[][] pieces3 = {{2},{1, 3}};
        System.out.println(isArrayConcetinate(arr3, pieces3));

        int [] arr4 = {1, 2, 3};
        int[][] pieces4 = {{2},{1, 4}};
        System.out.println(isArrayConcetinate(arr4, pieces4));
        /*
        You are given an array of distinct integers arr and an array of integer arrays pieces,
        where the integers in pieces are distinct. Your goal is to form arr by concatenating the
        arrays in pieces in any order. However, you are not allowed to reorder the integers in each
        array pieces[i].

        Return true if it is possible to form the array arr from pieces. Otherwise, return false.
        Example 1:

        Input: arr = [15,88], pieces = [[88],[15]]
        Output: true
        Explanation: Concatenate [15] then [88]
        Example 2:

        Input: arr = [49,18,16], pieces = [[16,18,49]]
        Output: false
        Explanation: Even though the numbers match, we cannot reorder pieces[0].
        Example 3:

        Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
        Output: true
        Explanation: Concatenate [91] then [4,64] then [78]
         */
    }
}
