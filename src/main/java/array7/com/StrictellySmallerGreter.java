package array7.com;

public class StrictellySmallerGreter {
    public int countElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int count = 0;

        // Count elements between min and max
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }

        return count;
    }
    public static void main(String args[]){
        /*
        Given an integer array nums, return the number of elements that have both a
        strictly smaller and a strictly greater element appear in nums.

        Example 1:

        Input: nums = [11,7,2,15]
        Output: 2
        Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly
        greater than it.
        Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
        In total there are 2 elements having both a strictly smaller and a strictly greater element
        appear in nums.
        Example 2:

        Input: nums = [-3,3,3,90]
        Output: 2
        Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly
         greater than it.
        Since there are two elements with the value 3, in total there are 2 elements having both a strictly
         smaller and a strictly greater element appear in nums.
         */
    }
}
