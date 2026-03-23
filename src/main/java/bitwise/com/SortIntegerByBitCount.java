package bitwise.com;

import java.util.*;

public class SortIntegerByBitCount {
    public static int[] sortByBits2(int arr[]){
        Integer []temp = new Integer[arr.length];
        for(int i =0; i<arr.length; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp , (a, b)->{
            int BITa = Integer.bitCount(a);
            int BITb = Integer.bitCount(b);
            if(BITb == BITa){
                return Integer.compare(a, b);
            }
            return Integer.compare(BITa, BITb);
        });

        for(int i =0; i<arr.length; i++){
          arr[i] =   temp[i] ;
        }
        return arr;
    }

    public static int[] sortByBits(int[] arr) {
        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
        int res[] = new int[arr.length];
        for(int n : arr){
//            int binCount = binary(n);
            int binCount = Integer.bitCount(n);
            if(map.containsKey(binCount)){
                map.get(binCount).add(n);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(n);
                map.put(binCount, l);
            }
        }
        int index = 0;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            list.sort(Comparator.naturalOrder());
            for(int i : list){
                res[index++] = i;
            }
        }
        return res;
    }
    public static int binary(int num){
        int count = 0;
        while(num > 0){
            if(num % 2 == 1){
                count++;
            }
            num /= 2;
        }
        return count;
    }
    public static void main(String args[]){
        /*
        he array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number
        of 1's you have to sort them in ascending order.

        Return the array after sorting it.

        Example 1:

        Input: arr = [0,1,2,3,4,5,6,7,8]
        Output: [0,1,2,4,8,3,5,6,7]
        Explantion: [0] is the only integer with 0 bits.
        [1,2,4,8] all have 1 bit.
        [3,5,6] have 2 bits.
        [7] has 3 bits.
        The sorted array by bits is [0,1,2,4,8,3,5,6,7]
        Example 2:

        Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
        Output: [1,2,4,8,16,32,64,128,256,512,1024]
        Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.

         */
    }
}
