package array4.com;

import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        Map<Integer, Integer> tree = new TreeMap<>();
        for(int i : arr2){
            List<Integer> list = new ArrayList<>();
            map.put(i, list);
        }

        for(int i : arr1){
            if(map.containsKey(i)){
                List<Integer> l =  map.get(i);
                l.add(i);
            }else{
                tree.put(i , tree.getOrDefault(i, 0) + 1);

            }
        }
        int index =0;
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> subAns = entry.getValue();
            for(Integer i : subAns){
                arr1[index++] = i;
            }
        }
        for(Map.Entry<Integer, Integer> entry : tree.entrySet()){
            int val = entry.getValue();
            while(val > 0){
                arr1[index++] = entry.getKey();
                val--;
            }
        }
        return arr1;
    }
    public static void main(String arg[]){
        /*
        Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.



Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
Example 2:

Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]
         */
    }
}
