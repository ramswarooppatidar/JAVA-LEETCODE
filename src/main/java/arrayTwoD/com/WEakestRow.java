package arrayTwoD.com;

import java.util.*;

public class WEakestRow {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, List<Integer>> treeMap = new TreeMap<>();
        int res[] = new int[k];
        int n = mat.length;
        int m = mat[0].length;
        for(int i =0; i<n; i++){
            int count = 0;
            for(int j =0; j<m; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(treeMap.containsKey(count)){
                treeMap.get(count).add(i);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(i);
                treeMap.put(count, l);
            }
        }
        int index=0;
        for(Map.Entry<Integer,List<Integer>> entry : treeMap.entrySet()){
            List<Integer> rows = entry.getValue();
            for(int row : rows){
                if(index == k)break;
                res[index++] = row;
            }

        }
        return res;
    }
    public int[] kWeakestRows2(int[][] mat, int k) {

        int n = mat.length;
        int[][] arr = new int[n][2]; // [count, index]

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }

            arr[i][0] = count;
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1]; // smaller index first
            }
            return a[0] - b[0];
        });

        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = arr[i][1];
        }

        return res;
    }
    public static void main(String args[]){
        /*
        You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

        A row i is weaker than a row j if one of the following is true:

        The number of soldiers in row i is less than the number of soldiers in row j.
        Both rows have the same number of soldiers and i < j.
        Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.



        Example 1:

        Input: mat =
        [[1,1,0,0,0],
         [1,1,1,1,0],
         [1,0,0,0,0],
         [1,1,0,0,0],
         [1,1,1,1,1]],
        k = 3
        Output: [2,0,3]
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 2
        - Row 1: 4
        - Row 2: 1
        - Row 3: 2
        - Row 4: 5
        The rows ordered from weakest to strongest are [2,0,3,1,4].
        Example 2:

        Input: mat =
        [[1,0,0,0],
         [1,1,1,1],
         [1,0,0,0],
         [1,0,0,0]],
        k = 2
        Output: [0,2]
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 1
        - Row 1: 4
        - Row 2: 1
        - Row 3: 1
        The rows ordered from weakest to strongest are [0,2,3,1].

         */
    }
}
