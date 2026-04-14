package maths.com;

public class AddNum {
    public static int addNum(int num){
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            System.out.println("sum :"+sum);
            num = sum;
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(addNum(3834567));
    }
}
