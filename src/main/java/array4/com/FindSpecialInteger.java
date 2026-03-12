package array4.com;

public class FindSpecialInteger {
    public static int findSpecialInteger(int arr[]){
        int n = arr.length;
        double specialCount = (n*25)/100.0;
        int check = (int) Math.ceil(specialCount);

        int res = arr[0];
        int prev = arr[0];
        int count = 0;

        for(int i =0; i<n ; i++){
            if(arr[i] == prev){
                count++;
            }else{
                count = 1;
                prev = arr[i];
            }

            if(count >= check){
                res = prev;
            }
        }
        return res;
    }
    public static int findSpecialInteger2(int arr[]){
        int n = arr.length;
        double specialCount = (n*25)/100.0;
        int check = (int) Math.ceil(specialCount);

//        int res = arr[0];
        int prev = arr[0];
        int count = 0;

        for(int i =0; i<n ; i++){
            if(arr[i] == prev){
                count++;
            }else{
                count = 1;
                prev = arr[i];
            }

            if(count >= check){
                return prev;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int arr[] = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));

        int arr2[] = {1,1};
        System.out.println(findSpecialInteger(arr2));

        int arr3[] = {1,2,3,3};
        System.out.println(findSpecialInteger(arr3));

        int arr4[] = {1,2,3,3};
        System.out.println(findSpecialInteger2(arr4));
        /*
        Given an integer array sorted in non-decreasing order, there is exactly one integer
        in the array that occurs more than 25% of the time, return that integer.

        Example 1:

        Input: arr = [1,2,2,6,6,6,6,7,10]
        Output: 6
        Example 2:

        Input: arr = [1,1]
        Output: 1

         */
    }
}
