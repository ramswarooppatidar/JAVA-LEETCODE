package array6.com;

import java.util.*;

public class ConatinsPattern {
    public boolean containsPattern(int[] arr, int m, int k) {

        for (int i = 0; i + m * k <= arr.length; i++) {

            int count = 0;

            for (int j = i; j < i + m * (k - 1); j++) {
                if (arr[j] == arr[j + m]) {
                    count++;
                }
            }

            if (count == m * (k - 1)) {
                return true;
            }
        }

        return false;
    }
    
    //thois is not work for consucative pattern tracking
    public static boolean containsPattern2(int[] arr, int m, int k) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            list.add(arr[i]);
            if(list.size() == m){
                map.put(list, map.getOrDefault(list, 0) + 1);
                list = new ArrayList<>();
            }
        }
        for(Integer val : map.values()){
            if(val >= k){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        /*
            1566. Detect Pattern of Length M Repeated K or More Times
            Hint
            Given an array of positive integers arr, find a pattern of length m that is repeated k or more times.

            A pattern is a subarray (consecutive sub-sequence) that consists of one or more values,
            repeated multiple times consecutively without overlapping. A pattern is defined by its
            length and the number of repetitions.

            Return true if there exists a pattern of length m that is repeated k or more times, otherwise return false.


         */
    }
}
