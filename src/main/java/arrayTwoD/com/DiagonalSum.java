package arrayTwoD.com;

public class DiagonalSum {
    public static int diagonalSum(int mat[][]){
        int len = mat.length;
        int sum = 0;
        for(int i =0; i<len; i++){
            sum += mat[i][i];
            sum += mat[i][len - 1 - i];
        }
        if(len % 2 != 0){
            sum -= mat[(len - 1)/2][(len - 1)/2];
        }
        return sum;
    }
    public static void main(String args[]){
        /*
        Given a square matrix mat, return the sum of the matrix diagonals.
        Only include the sum of all the elements on the primary diagonal and all the
        elements on the secondary diagonal that are not part of the primary diagonal.
         */
    }
}
