package array4.com;

public class DitPlanPerformance {
    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {

        int left = 0;
        int right = left + k;
        int result = 0;
        while(right<calories.length){
            int windowSum = 0;
            for(int i = left; i < right; i++){
                windowSum += calories[i];
            }
            if(windowSum < lower){
                result -= 1;
            }else{
                result += 1;
            }

            if(windowSum < upper){
                result -= 1;
            }else{
                result += 1;
            }
            left = right;
            right = left + k;
        }

        return result;
    }
    public static int dietPlanPerformance2(int[] calories, int k, int lower, int upper) {

        int left = 0;
        int result = 0;

        while(left + k <= calories.length){

            int windowSum = 0;

            for(int i = left; i < left + k; i++){
                windowSum += calories[i];
            }

            if(windowSum < lower){
                result--;
            }
            else if(windowSum > upper){
                result++;
            }

            left++;
        }

        return result;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(dietPlanPerformance(arr,1,3,3));

        int arr2[]={3, 2};
        System.out.println(dietPlanPerformance(arr,2,0,1));
        /*
        Problem: Diet Plan Performance

        A dieter consumes calories every day.

        You are given:

        an integer array calories

        an integer k

        an integer lower

        an integer upper

        For every consecutive k days, calculate the total calories consumed.

        Rules:

        If the total calories < lower, the dieter loses 1 point

        If the total calories > upper, the dieter gains 1 point

        Otherwise, no change

        Return the total points after evaluating all k-day windows.

        Example 1

        Input

        calories = [1,2,3,4,5]
        k = 1
        lower = 3
        upper = 3

        Output

        0

        Explanation

        [1] < 3 → -1
        [2] < 3 → -1
        [3] = 3 → 0
        [4] > 3 → +1
        [5] > 3 → +1

        Total

        -1 -1 +0 +1 +1 = 0
        Example 2

        Input

        calories = [3,2]
        k = 2
        lower = 0
        upper = 1

        Output

        1

        Explanation

        [3,2] → sum = 5
        5 > 1 → +1
        Constraints
        1 <= calories.length <= 10^5
        0 <= calories[i] <= 20000
        1 <= k <= calories.length
        0 <= lower <= upper
         */
    }
}
