package maths.com;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num){
        if(num < 1) return false;
        int left = 1;
        int right = num;
        while(left <= right){
            int mid = left + (right - left)/2;
            long square = (long) mid*mid;
            if(square == num) return true;
            else if(square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(625));
    }
}
