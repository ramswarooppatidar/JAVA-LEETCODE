package hashmap.com;

import java.util.HashMap;
import java.util.*;

public class CountLargetGroup {
    public static int countLargetGroup(int n){
        Map<Integer, List<Integer>> map = new HashMap<>();

        int largetGroup = 0;

        for(int i = 1; i<=n; i++){
            int sum =0;
            int num = i;
            while(num > 0){
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }

            if(map.containsKey(sum)){
                map.get(sum).add(i);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(sum, list);
            }
        }

        //extract Map
        Map<Integer, Integer> sizeMap = new HashMap<>();
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            System.out.println(entry.getValue());
            sizeMap.put(entry.getValue().size(), sizeMap.getOrDefault(entry.getValue().size(),0)+ 1);
        }

        int largestSize = 0;
        for(Map.Entry<Integer, Integer> entry : sizeMap.entrySet()){
            if(largestSize < entry.getKey()){
                largetGroup = entry.getValue();
                largestSize = entry.getKey();
            }
        }


        return largetGroup;
    }
    public static  int largestGroupCount(int n){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i<=n; i++){
            int sum = 0;
            int num = i;
            while(num > 0){
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int maxSize = 0;
        int count = 0;
        for(int size : map.values()){
            if(size > maxSize){
                maxSize = size;
                count = 1;
            }else if(maxSize == size){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
       int res = countLargetGroup(100);
       System.out.print("res "+res);
        /*
        You are given an integer n.

        We need to group the numbers from 1 to n according to the sum of its digits. For example, the numbers 14 and 5 belong to the same group, whereas 13 and 3 belong to different groups.

        Return the number of groups that have the largest size, i.e. the maximum number of elements.



        Example 1:

        Input: n = 13
        Output: 4
        Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
        [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
        There are 4 groups with largest size.
        Example 2:

        Input: n = 2
        Output: 2
        Explanation: There are 2 groups [1], [2] of size 1.


        Constraints:

        1 <= n <= 104
         */
    }
}
