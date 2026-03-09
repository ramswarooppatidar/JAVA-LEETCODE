package arrayTwoD.com;

import java.util.*;

public class MatricCellDistance {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer, List<Integer[]>> treeMap = new TreeMap<>();
        for(int i =0;i<rows; i++){
            for(int j = 0; j< cols; j++){
                int distance = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                if(treeMap.containsKey(distance)){
                    treeMap.get(distance).add(new Integer[]{i, j});
                }else{

                    List<Integer[]> list = new ArrayList<>();
                    list.add(new Integer[]{i, j});
                    treeMap.put(distance, list);
                    // treeMap.put(distance,list.add(new Integer[]{i, j}));
                }
            }
        }
        List<List<Integer[]>> resList = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer[]>> entry : treeMap.entrySet()){
            List<Integer[]> listOfCor = entry.getValue();
            List<Integer[]> subArr = new ArrayList<>();
            for(Integer[]  arr : listOfCor){
                subArr.add(arr);
            }
            resList.add(subArr);
        }
        for(List<Integer[]> lis : resList){
            for(Integer[] arr : lis){
                for(Integer i : arr){
                    System.out.print(i+" ");
                }
                System.out.print("    ");
            }
        }int total = 0;
        for (List<Integer[]> list : resList) {
            total += list.size();
        }
        int[][] result = new int[total][2];

        int index = 0;
        for (List<Integer[]> list : resList) {
            for (Integer[] arr : list) {
                result[index][0] = arr[0];
                result[index][1] = arr[1];
                index++;
            }
        }



        return result;
    }
    public static void main(String arg[]){
        /*
        You are given four integers row, cols, rCenter, and cCenter.
        There is a rows x cols matrix and you are on the cell with the
        coordinates (rCenter, cCenter).

Return the coordinates of all cells in the matrix, sorted by their distance from
(rCenter, cCenter) from the smallest distance to the largest distance. You may return
the answer in any order that satisfies this condition.

The distance between two cells (r1, c1) and (r2, c2) is |r1 - r2| + |c1 - c2|.



Example 1:

Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0
Output: [[0,0],[0,1]]
Explanation: The distances from (0, 0) to other cells are: [0,1]
Example 2:

Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1
Output: [[0,1],[0,0],[1,1],[1,0]]
Explanation: The distances from (0, 1) to other cells are: [0,1,1,2]
The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
Example 3:

Input: rows = 2, cols = 3, rCenter = 1, cCenter = 2
Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
Explanation: The distances from (1, 2) to other cells are: [0,1,1,2,2,3]
There are other answers that would also be accepted as correct, such as [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].

         */
    }
}
