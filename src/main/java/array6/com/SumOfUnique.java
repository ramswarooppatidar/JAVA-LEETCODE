package array6.com;
import java.util.*;
public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
    public int sumOfUnique2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
