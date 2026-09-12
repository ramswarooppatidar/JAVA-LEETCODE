package maths.com.maths2.com;

public class SubsetXORSum {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int index, int xor) {

        // All elements processed
        if (index == nums.length) {
            return xor;
        }

        // Don't take nums[index]
        int without = helper(nums, index + 1, xor);

        // Take nums[index]
        int with = helper(nums, index + 1, xor ^ nums[index]);

        return without + with;
    }
    public static void main(String args[]){
        /*
        Start:

        1 = 001

        Move 1 position:

        010 = 2

        Move another position:

        100 = 4

        1 << 0 = 1
        1 << 1 = 2
        1 << 2 = 4
        1 << 3 = 8
        1 << 4 = 16
         */
    }
}
