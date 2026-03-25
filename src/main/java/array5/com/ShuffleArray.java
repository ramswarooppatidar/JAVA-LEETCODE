package array5.com;

public class ShuffleArray {public int[] shuffle(int[] nums, int n) {
    int[] res = new int[2*n];

    for(int i = 0; i < n; i++){
        res[2*i] = nums[i];
        res[2*i+1] = nums[i+n];
    }

    return res;
}

    public static int[] shuffleArray(int nums[], int n){
        int left = 1;
        int right = n;
        int k = 1;
        while(left < n* 2 && right < n * 2){
            int temp = nums[right];
            for(int i = right; i>left; i--){
                nums[i] = nums[i - 1];

            }
            nums[left] = temp;
            left += 2;
            right += 1;
        }
        return nums;
    }
    public static int[] shuffleArray2(int nums[], int n){
        int left = 1;
        int val = n;
        int k = 1;
        while(k < val){
            int temp = nums[n];
            for(int i = n; i>left; i--){
                nums[i] = nums[i - 1];

            }
            nums[left] = temp;
            k++;
            n++;
            left += 2;
        }
        return nums;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        int res[] = shuffleArray(arr,10);
        for(int i : res){
            System.out.print(i+" , ");
        }
        System.out.println("");
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        int res2[] = shuffleArray2(arr1,10);
        for(int i : res2){
            System.out.print(i+" , ");
        }
        /*
                Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn].



        Example 1:

        Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]
        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        Example 2:

        Input: nums = [1,2,3,4,4,3,2,1], n = 4
        Output: [1,4,2,3,3,2,4,1]
        Example 3:

        Input: nums = [1,1,2,2], n = 2
        Output: [1,2,1,2]

         */
    }
}
