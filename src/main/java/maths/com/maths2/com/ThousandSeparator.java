package maths.com.maths2.com;

public class ThousandSeparator {
    public static String thousandSeparator(int n){
        if(n < 1000){
            return String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while(n > 0){
            k++;
            sb.append(n % 10);
            n /= 10;
            if(k % 3 == 0 && n>0){
                sb.append('.');
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String asgs[]){
        System.out.println(thousandSeparator(124563));
        System.out.println(thousandSeparator(124));
        System.out.println(thousandSeparator(87485));
        System.out.println(thousandSeparator(1748556466));

    }
}
