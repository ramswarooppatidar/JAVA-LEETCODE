package array6.com;

public class GetMaximumGenerated {
    public static int getMaximumGebnerated(int n){
        int arr[] = new int[n + 1];
        int max = 0;
        if(n == 0){
            return max;
        }
        arr[0] = 0;
        arr[1] = 1;
//        if(n % 2 == 0){
//            n = n - 1;
//        }
//        for(int i = 1; i<=n/2; i++){
//            arr[i*2] = arr[i];
//            arr[i*2 + 1] = arr[i + 1] + arr[i];
//            max = Math.max(max, Math.max(arr[i*2], arr[i*2 + 1]));
//        }

        for(int i = 1; 2*i <=n; i++){
            arr[i*2] = arr[i];
            max = Math.max(max , arr[i*2]);
            if(i*2 + 1 <= n){
                arr[i*2 + 1] = arr[i] + arr[i+ 1];
                max = Math.max(max , arr[i*2 + 1]);
            }
        }

        for (int i = 1; 2 * i <= n; i++) {
            arr[2 * i] = arr[i];
            max = Math.max(max, arr[2 * i]);

            if (2 * i + 1 <= n) {
                arr[2 * i + 1] = arr[i] + arr[i + 1];
                max = Math.max(max, arr[2 * i + 1]);
            }
        }



        for(int i : arr){
            System.out.print(i+" ");
        }
        return max;
    }
    public static void main(String args[]){
        /*
        You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:

        nums[0] = 0
        nums[1] = 1
        nums[2 * i] = nums[i] when 2 <= 2 * i <= n
        nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
        Return the maximum integer in the array nums​​​.



        Example 1:

        Input: n = 7
        Output: 3
        Explanation: According to the given rules:
          nums[0] = 0
          nums[1] = 1
          nums[(1 * 2) = 2] = nums[1] = 1
          nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
          nums[(2 * 2) = 4] = nums[2] = 1
          nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
          nums[(3 * 2) = 6] = nums[3] = 2
          nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
        Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(0,1,1,2,1,3,2,3) = 3.
        Example 2:

        Input: n = 2
        Output: 1
        Explanation: According to the given rules, nums = [0,1,1]. The maximum is max(0,1,1) = 1.
        Example 3:

        Input: n = 3
        Output: 2
        Explanation: According to the given rules, nums = [0,1,1,2]. The maximum is max(0,1,1,2) = 2.

         */

        getMaximumGebnerated(8);
        System.out.println();
        getMaximumGebnerated(7);
        System.out.println();
        getMaximumGebnerated(2);

        System.out.println();
        getMaximumGebnerated(16);
    }
}
