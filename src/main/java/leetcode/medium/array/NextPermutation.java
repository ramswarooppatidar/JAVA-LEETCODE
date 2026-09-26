package leetcode.medium.array;

public class NextPermutation {
    public void nextPermutation(int[] nums){
        int n = nums.length - 1;
        int breakpoint = - 1;
        for(int i = n - 1; i>= 0; i--){
            if(nums[i] < nums[i + 1]){
                breakpoint = i;
                break;
            }
        }

        if(breakpoint == -1){
            reverse(nums, 0, n);
            return;
        }
        //next greater elemnt after break point;
        for(int i = n; i>breakpoint; i--){
            if(nums[i] > nums[breakpoint]){
                swap(nums, i, breakpoint);
                break;
            }
        }

        //reverse
        reverse(nums, breakpoint + 1, n);
    }
    public void nextPermutation2(int[] nums) {
        int n = nums.length - 1;
        // boolean isSwap = false;
        int breakPoint = -1;
        int j =0;

        for(int i = nums.length - 2; i>=0; i--){
            if(nums[i] < nums[i + 1]){
                swap(nums, i,n);
                // isSwap = true;
                breakPoint = i;
                break;
            }
        }




        if(breakPoint == -1){
            int left = 0;
            int right = n;
            reverse(nums,0, n);
        }else{
            //reverse
            reverse(nums, breakPoint + 1, n);

        }
    }
    private void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private void reverse(int nums[],int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]){
        /*
        Example 1:

        Input: nums = [1,2,3]
        Output: [1,3,2]
        Example 2:

        Input: nums = [3,2,1]
        Output: [1,2,3]
        Example 3:

        Input: nums = [1,1,5]
        Output: [1,5,1]
         */
    }
}
