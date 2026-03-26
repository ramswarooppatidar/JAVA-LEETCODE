package array5.com;

import java.util.ArrayList;
import java.util.List;

public class CountTriplates {
    /*
    Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

        A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

        0 <= i < j < k < arr.length
        |arr[i] - arr[j]| <= a
        |arr[j] - arr[k]| <= b
        |arr[i] - arr[k]| <= c
        Where |x| denotes the absolute value of x.

        Return the number of good triplets.


     */
    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int count = 0;

        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){

                    if(Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    //wrong missing lots of combination
    public int countGoodTriplets2(int[] arr, int a, int b, int c) {
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<arr.length - 2; i++){
            int a1 = arr[i];
            int left  = i +1;
            int right = arr.length - 1;

            while(left<right){
                int b1 = arr[left];
                int c1 = arr[right];
                List<Integer> l = new ArrayList<>();
                System.out.println(a1+" "+b1+" "+ c1);
                if(Math.abs(a1 - b1) <= a && Math.abs(b1 - c1) <= b && Math.abs(a1 - c1) <= c ){
                    count++;
                    l.add(a1);
                    l.add(b1);
                    l.add(c1);
                    list.add(l);
                }
                left++;
                right--;
            }
        }
        System.out.println(list);
        return count;
    }
}
