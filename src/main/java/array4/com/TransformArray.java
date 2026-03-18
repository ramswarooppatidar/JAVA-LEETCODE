package array4.com;

public class TransformArray {
    public static void transformArray(int arr[]){
         boolean isChange = false;
         int temp = arr[0];
        do{
            isChange = false;
            for(int i = 1; i<arr.length - 1; i++){
                if(arr[i] < temp && arr[i] < arr[i + 1]){
                    temp = arr[i];
                    arr[i]++;
                    isChange = true;
                }
                else if(arr[i] > temp && arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i]--;
                    isChange = true;
                }
            }
        }while(isChange);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6, 2, 3, 4};
        transformArray(arr);

        System.out.println(" ");
        int arr2[] = {1,6,3,4,3,5};
        transformArray(arr2);
        /*
         /*
        Problem Description

        You are given an integer array:

        arr

        You must repeatedly perform the following transformation until the array stops changing.

        For every element except the first and last:

        Rule 1

        If the element is strictly smaller than both neighbors, increase it by 1.

        arr[i] < arr[i-1] AND arr[i] < arr[i+1]
        → arr[i]++
        Rule 2

        If the element is strictly greater than both neighbors, decrease it by 1.

        arr[i] > arr[i-1] AND arr[i] > arr[i+1]
        → arr[i]--
        Rule 3

        Otherwise:

        Do nothing
        Important Constraints

        First and last elements never change

        All updates must be applied simultaneously in one round

        Continue transformations until the array stops changing
        Input

        arr = [6,2,3,4]
        Round 1
        6 2 3 4

        Check elements:

        2 < 6 AND 2 < 3 → increase

        Result

        6 3 3 4
        Round 2
        6 3 3 4

        No element satisfies the conditions.

        Final array:

        [6,3,3,4]
        Another Example

        Input

        [1,6,3,4,3,5]
        Round 1
        1 6 3 4 3 5

        Changes:

        6 > 1 AND 6 > 3 → 5
        3 < 6 AND 3 < 4 → 4
        4 > 3 AND 4 > 3 → 3
        3 < 4 AND 3 < 5 → 4

        Result

        1 5 4 3 4 5
        Round 2
        1 5 4 3 4 5

        Changes:

        5 > 1 AND 5 > 4 → 4
        3 < 4 AND 3 < 4 → 4

        Result

        1 4 4 4 4 5
        Round 3

        No more changes.

        Final array

        [1,4,4,4,4,5]
         */
    }
}
