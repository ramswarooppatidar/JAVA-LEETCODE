package arrayTwoD.com;

import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>>  result = new ArrayList<>();
        while(k > 0){
            int prev = grid[m - 1][n - 1];
            for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){
                    int temp = grid[i][j];
                    grid[i][j] = prev;
                    prev = temp;
                }
            }
            k--;
        }
        for(int i =0; i<m; i++){
            List<Integer> list = new ArrayList<>();
            for(int j =0; j<n; j++){
                list.add(grid[i][j]);
            }
            result.add(list);
        }

        return result;
    }
    public static void main(String args[]){
        int grid[][] ={{1,2,3}, {4,5,6},{7,8,9}};
        List<List<Integer>>  res= shiftGrid(grid, 1);
        System.out.println(res);

        int grid2[][] = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        List<List<Integer>>  res2 = shiftGrid(grid2, 4);
        System.out.println(res2);

        int grid3[][] ={{1,2,3}, {4,5,6},{7,8,9}};
        List<List<Integer>>  res3 = shiftGrid(grid3, 9);
        System.out.println(res3);
        /*
        Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

        In one shift operation:

        Element at grid[i][j] moves to grid[i][j + 1].
        Element at grid[i][n - 1] moves to grid[i + 1][0].
        Element at grid[m - 1][n - 1] moves to grid[0][0].
        Return the 2D grid after applying shift operation k times.



        Example 1:


        Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
        Output: [[9,1,2],[3,4,5],[6,7,8]]
        Example 2:


        Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
        Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
        Example 3:

        Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
        Output: [[1,2,3],[4,5,6],[7,8,9]]

         */
    }
}
