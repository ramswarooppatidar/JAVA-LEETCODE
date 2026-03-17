package array4.com;

import java.util.*;

public class LuckInteger {
    // this work only -128 to 127
    public static int luckNUmber(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxFreq = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                maxFreq =  Math.max(maxFreq, entry.getValue());
            }
        }
        return maxFreq;
    }

    public static int luckNUmber2(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxFreq = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                maxFreq =  Math.max(maxFreq, entry.getValue());
            }
        }
        return maxFreq;
    }
    public static int luckNUmber3(int arr[]){
        int freq[] = new int[501];
        for(int i : arr){
            freq[i]++;
        }
        int ans = -1;
        for(int i = 1; i<freq.length; i++){
            if(i == freq[i]){
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr1[]={10,10,10,10,10,10,10,10,10,10};
        System.out.print(luckNUmber(arr1));
        System.out.println("");
        int[] arr = new int[128];

        for (int i = 0; i < 128; i++) {
            arr[i] = 128;
        }

        System.out.print(luckNUmber(arr));
        System.out.println("");
        System.out.print(luckNUmber2(arr));
    }
}
