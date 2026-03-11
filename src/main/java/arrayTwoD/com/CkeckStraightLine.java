package arrayTwoD.com;

public class CkeckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];

        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for(int i = 2; i < coordinates.length; i++){

            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if((y - y0) * (x1 - x0) != (y1 - y0) * (x - x0)){
                return false;
            }
        }

        return true;
    }
    public boolean checkStraightLine2(int[][] coordinates) {
        if(coordinates.length == 2){
            return true;
        }
        int prevSlop = coordinates[1][1] - coordinates[0][1]/coordinates[1][0] - coordinates[0][0];

        for(int i = 2; i<coordinates.length; i++){
            int currentSlop = coordinates[i][1] - coordinates[i - 1][1]/coordinates[i][0] - coordinates[i - 1][0];
            if(currentSlop != prevSlop){
                return false;
            }
            prevSlop = currentSlop;
        }
        return true;
    }
    public static void main(String args[]){
/*
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

Input: coordinates = [[0, 0],[0, 1],[0, -1]]
Output: false
 */
    }
}
