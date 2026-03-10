package maths.com;

public class IsArmstronNumber {
    public static boolean isArmstrong(int n){
        int digit = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem*rem*rem;  //math.pow(rem , 3)
            n /= 10;
        }
        return sum == digit;
    }
    public  static void main(String args[]){
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
        System.out.println(isArmstrong(370));
    }
}
