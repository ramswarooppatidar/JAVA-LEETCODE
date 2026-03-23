package bitwise.com;

public class CreateBinary {
    public static void binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        System.out.println(sb.reverse().toString());
    }
    public static void main(String args[]){
        binary(1024);
        binary(512);
        binary(256);
        binary(128);
        binary(64);
        binary(32);
        binary(16);
        binary(8);
        binary(4);
        binary(2);
        binary(1);
        /*

         */
    }
}
