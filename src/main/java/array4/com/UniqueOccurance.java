package array4.com;

import java.util.*;

public class UniqueOccurance {
    public static boolean uniqueOccurance(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,3,3,4,4,4,5,5,5,5,6,6,6,6,6};
    System.out.println(uniqueOccurance(arr));
    }
}
