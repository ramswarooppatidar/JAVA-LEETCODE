package arrayTwoD.com;

public class TRansPoseMatrix {
    public static boolean findRotation(int mat[][], int target[][]){
        int n = mat.length;
        int k = 1;
        while(k <= 4){
            if(compare(mat, target)){
                return true;
            }
            //rotated by 90 degree,
            int temp[][] = new int[n][n];
            for(int i =0; i<n; i++){
                for(int j =0; j<n; j++){
                    temp[j][n - 1 - i] = mat[i][j];
                }
            }
            mat = temp;
            k++;
        }
        return false;
    }
    private static boolean compare(int mat[][],int target[][]){
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat.length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        /*
        Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
        Example 1:


        Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
        Output: true
        Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
        Example 2:


        Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
        Output: false
        Explanation: It is impossible to make mat equal to target by rotating mat.
        Example 3:


        Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
        Output: true
        Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

         */
    }
}
