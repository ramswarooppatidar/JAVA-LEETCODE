package array6.com;

public class FindMiddleIndex {
    public static int fingMiddleIndex(int nums[]){
        int leftSum = 0;
        int rightSum = 0;
        for(int n : nums){
            rightSum += n;
        }
        if(leftSum  == rightSum - nums[0]){
            return 0;
        }
        for(int i =0; i<nums.length; i++){
            rightSum -= nums[i];
            if(i != 0){
                leftSum += nums[i - 1];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] nums = {5, 0};
        System.out.println(fingMiddleIndex(nums));

        int [] nums2 = {2,3,-1,8,4};
        System.out.println(fingMiddleIndex(nums2));

        int [] nums3 = {1,-1,4};
        System.out.println(fingMiddleIndex(nums3));

        int [] nums4 = {2,5};
        System.out.println(fingMiddleIndex(nums4));
        /*
        Example 1:

        Input: nums = [2,3,-1,8,4]
        Output: 3
        Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
        The sum of the numbers after index 3 is: 4 = 4
        Example 2:

        Input: nums = [1,-1,4]
        Output: 2
        Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
        The sum of the numbers after index 2 is: 0
        Example 3:

        Input: nums = [2,5]
        Output: -1
        Explanation: There is no valid middleIndex.



         */
    }
}
