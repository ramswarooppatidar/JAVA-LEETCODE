package string.com.string6.easy;

public class WeightSquare {
    // https://assets.leetcode.com/uploads/2021/02/19/screenshot-2021-02-20-at-22159-pm.png
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        char ch1 = coordinates.charAt(1);
        int val = ch1 - 'a';
        if(ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g'){

            if(val % 2 == 0){
                return false;
            }
        }else{
            if(val % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        /*
        You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.



Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.



Example 1:

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
Example 2:

Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
Example 3:

Input: coordinates = "c7"
Output: false
         */
    }
}
