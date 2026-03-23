package arrayTwoD.com;

public class CountNegSortedMatrix {
    public static int countNegative(int [][]matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;

        int col = m - 1;
        int row = 0;
        while(row < n && col >= 0){
            if(matrix[row][col] < 0){
                count += (n - row);
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.print(countNegative(grid));
        /*
        Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

        Example 1:

        Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
        Output: 8
        Explanation: There are 8 negatives number in the matrix.
        Example 2:

        Input: grid = [[3,2],[1,0]]
        Output: 0

         */
    }
}
