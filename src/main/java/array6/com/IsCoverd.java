package array6.com;

import java.util.ArrayList;
import java.util.List;

public class IsCoverd {
    public boolean isCovered(int[][] ranges, int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int arr[] : ranges){
            int start = arr[0];
            int end = arr[1];
            for(int i = start; i<=end; i++){
                list.add(i);
            }
        }
        // System.out.println(list);
        for(int i = left; i<=right; i++){
            if(!list.contains(i)){
                return false;
            }
        }
        // Boolean indexBool = list.indexOf(left) <= list.indexOf(right);
        // return list.contains(left) && list.contains(right) && indexBool;
        return true;
    }
    public static void main(String args[]){
        /*
        You are given a 2D integer array ranges and two integers left and right. Each ranges[i] = [starti, endi] represents an inclusive interval between starti and endi.

        Return true if each integer in the inclusive range [left, right] is covered by at least one interval in ranges. Return false otherwise.

        An integer x is covered by an interval ranges[i] = [starti, endi] if starti <= x <= endi.



        Example 1:

        Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
        Output: true
        Explanation: Every integer between 2 and 5 is covered:
        - 2 is covered by the first range.
        - 3 and 4 are covered by the second range.
        - 5 is covered by the third range.
        Example 2:

        Input: ranges = [[1,10],[10,20]], left = 21, right = 21
        Output: false
        Explanation: 21 is not covered by any range.
         */
    }
}
