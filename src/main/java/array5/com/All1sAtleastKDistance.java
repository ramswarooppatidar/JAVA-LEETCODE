package array5.com;

public class All1sAtleastKDistance {
    public static boolean kSpaceApart(int nums[], int k){
        int firstIndex =- 1;
        boolean isFirstIndex = false;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1){
                if(!isFirstIndex){
                    firstIndex = i;
                    isFirstIndex = true;
                }else{
                    if(i - firstIndex <= k){
                        return false;
                    }
                    firstIndex = i;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        /*
        Example 1:

        Input: nums = [1,0,0,0,1,0,0,1], k = 2
        Output: true
        Explanation: Each of the 1s are at least 2 places away from each other.
        Example 2:

        Input: nums = [1,0,0,1,0,1], k = 2
        Output: false
        Explanation: The second 1 and third 1 are only one apart from each other.

         */
    }
}
