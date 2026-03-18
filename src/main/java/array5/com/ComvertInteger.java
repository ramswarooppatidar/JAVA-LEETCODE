package array5.com;

public class ComvertInteger {
    public static int[] getNoZeroIntegers(int n) {
        for(int a = 1; a <= n; a++){
            int b = n - a;
            if(nonZero(a) && nonZero(b)){
                return new int[]{a, b};
            }
        }

        return new int[]{};
    }
    public static boolean nonZero(int a){
        while(a > 0){
            int rem = a % 10;
            if(rem == 0){
                return false;
            }
            a /= 10;
        }
        return true;
    }
    public static void main(String args[]){
        /*
        No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

        Given an integer n, return a list of two integers [a, b] where:

        a and b are No-Zero integers.
        a + b = n
        The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.



        Example 1:

        Input: n = 2
        Output: [1,1]
        Explanation: Let a = 1 and b = 1.
        Both a and b are no-zero integers, and a + b = 2 = n.
        Example 2:

        Input: n = 11
        Output: [2,9]
        Explanation: Let a = 2 and b = 9.
        Both a and b are no-zero integers, and a + b = 11 = n.
        Note that there are other valid answers as [8, 3] that can be accepted.

         */
    }
}
