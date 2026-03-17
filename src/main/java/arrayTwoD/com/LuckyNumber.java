package arrayTwoD.com;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static List<Integer> minElementInRowAndMaxInCol(int [][]matrix){
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0; i<n; i++){
            int min = matrix[i][0];
            int col = 0;
            for(int j =0; j< m; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    col = j;
                }
            }

            boolean isLucky = true;
            for(int k =0; k < n; k++){
                if(matrix[k][col] > min){
                    isLucky = false;
                    break;
                }
            }

            if(isLucky){
                result.add(min);
            }
        }
        return result;
    }

    public List<Integer> luckyNumbers2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> rowMinIndex = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<n; i++){
            int min = matrix[i][0];
            int minIndex = 0;
            for(int j =0; j<m; j++){

                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            System.out.println(minIndex);
            rowMinIndex.add(minIndex);
        }
        int index =0;
        for(int k : rowMinIndex){
            int max = matrix[index++][k];
            boolean isLargest = true;
            for(int i =0; i<n; i++){
                if(matrix[i][k] > max){
                    isLargest = false;
                    break;
                }
            }
            if(isLargest){
                result.add(max);
            }

        }
        return result;
    }
    public static void main(String args[]){
        int [][]matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(minElementInRowAndMaxInCol(matrix));

        int [][]matrix1 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(minElementInRowAndMaxInCol(matrix1));

        int [][]matrix2 = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(minElementInRowAndMaxInCol(matrix2));
        /*
        Given an m x n matrix of distinct numbers, return all lucky numbers in the
         matrix in any order.

        A lucky number is an element of the matrix such that it is the minimum
        element in its row and maximum in its column.

        Example 1:

        Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        Output: [15]
        Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
        Example 2:

        Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        Output: [12]
        Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
        Example 3:

        Input: matrix = [[7,8],[1,2]]
        Output: [7]
        Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
         */
    }
}
