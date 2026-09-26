package array6.com;

public class CountSpecialQuadrupletsGood {
    public static int countQuadruplets1(int nums[]){
        int n = nums.length;
        int count = 0;
        int suffix[] = new int[101];
        for(int c = n - 2; c>=2; c--){
            suffix[nums[c + 1]]++;

            for(int b = 1; b<c; b++){
                for(int a = 0; a < b; a++){
                    int target = nums[a] + nums[b] + nums[c];

                    if(target <= 100){
                        count += suffix[target];
                    }
                }
            }
        }
        return count;
    }


    public static int countQuadruplets(int nums[]){
        int n = nums.length ;
        int count = 0;
        for(int i =0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                for(int k = j+ 1; k<n; k++){
                    for(int l = k+ 1; l<n; l++){
                        if(nums[i] + nums[j] + nums[k] == nums[l]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int [] nums = {1,2,3,6};
        System.out.println(countQuadruplets(nums));

        int [] nums1 = {3,3,6,4,5};
        System.out.println(countQuadruplets(nums1));

        int [] nums2 = {1,1,1,3,5};
        System.out.println(countQuadruplets(nums2));

        int [] nums3 = {1,2,3,6};
        System.out.println(countQuadruplets1(nums3));

        int [] nums4 = {3,3,6,4,5};
        System.out.println(countQuadruplets1(nums4));

        int [] nums5 = {1,1,1,3,5};
        System.out.println(countQuadruplets1(nums5));
        /*
         Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:

        nums[a] + nums[b] + nums[c] == nums[d], and
        a < b < c < d


        Example 1:

        Input: nums = [1,2,3,6]
        Output: 1
        Explanation: The only quadruplet that satisfies the requirement is (0, 1, 2, 3) because 1 + 2 + 3 == 6.
        Example 2:

        Input: nums = [3,3,6,4,5]
        Output: 0
        Explanation: There are no such quadruplets in [3,3,6,4,5].
        Example 3:

        Input: nums = [1,1,1,3,5]
        Output: 4
        Explanation: The 4 quadruplets that satisfy the requirement are:
        - (0, 1, 2, 3): 1 + 1 + 1 == 3
        - (0, 1, 3, 4): 1 + 1 + 3 == 5
        - (0, 2, 3, 4): 1 + 1 + 3 == 5
        - (1, 2, 3, 4): 1 + 1 + 3 == 5


        Constraints:

        4 <= nums.length <= 50
        1 <= nums[i] <= 100
         */
    }
}
