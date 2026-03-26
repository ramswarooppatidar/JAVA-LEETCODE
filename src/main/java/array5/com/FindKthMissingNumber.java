package array5.com;

public class FindKthMissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int index = 0;
        int number = 0;
        int n = k;
        for(int i =1; i<=(arr[arr.length - 1] + n ); i++){
            if(index <arr.length && i == arr[index]){
                index++;
            }else{
                k--;
            }
            if(k == 0){
                return i;
            }
        }
        return -1;
    }
    public int findKthPositive2(int[] arr, int k) {

        for(int i = 0; i < arr.length; i++){
            int missing = arr[i] - (i + 1);

            if(missing >= k){
                return i + k;
            }
        }

        return arr.length + k;
    }
    public static void main(String args[]){
        /*

         */
    }
}
