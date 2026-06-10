package array6.com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
    public static int[] sortByFrequency(int arr[]){
        Map<Integer, Integer> fre = new HashMap<>();
        for(int i : arr){
            fre.put(i, fre.getOrDefault(i, 0) + 1);
        }
//        Integer num[] = Arrays.stream(arr).boxed().toArray(Integer::new);

        Integer[] num = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(num, (a, b)->{
            if(fre.get(a).equals(fre.get(b))){
                return b - a;
            }
            return fre.get(a) - fre.get(b);
        });
        return Arrays.stream(num).mapToInt(i -> i).toArray();
    }
    public static void main(String args[]){

    }
}
