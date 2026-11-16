package arrayTwoD.com.array2;

public class Construct1Dto2D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int element = original.length;
        int res[][] = new int[m][n];
        if(element != m*n){
            return new int[0][0];
        }
        int k =0;
        for(int i =0; i<m; i++){
            for(int j = 0; j<n; j++){
                res[i][j] = original[k++];
            }
        }
        return res;
    }
    public static void man(String args[]){
        /*
        Input: original = [1,2,3,4], m = 2, n = 2
        Output: [[1,2],[3,4]]
        Explanation: The constructed 2D array should contain 2 rows and 2 columns.
        The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
        The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.
        Example 2:

        Input: original = [1,2,3], m = 1, n = 3
        Output: [[1,2,3]]
        Explanation: The constructed 2D array should contain 1 row and 3 columns.
        Put all three elements in original into the first row of the constructed 2D array.
        Example 3:

        Input: original = [1,2], m = 1, n = 1
        Output: []
        Explanation: There are 2 elements in original.
        It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.


        Constraints:

        1 <= original.length <= 5 * 104
        1 <= original[i] <= 105
        1 <= m, n <= 4 * 104


         */
    }
}
