package maths.com;

public class SubProductAndSum {
    public static int subProductSum(int n){
        int sum =0;
        int product = 1;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        return (product - sum);
    }
    public static void main(String args[]){

    }
}
