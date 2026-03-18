package array4.com;

public class ArithemeticSeries {
    public static int missingInArithemeticSeries(int arr[]){
        int n = arr.length;
        int diff = (arr[n - 1] - arr[0])/n;

        for(int i = 1; i<n; i++){
            if(arr[i] - arr[i - 1] != diff){
              return arr[i - 1] + diff;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,7,11,13};
        System.out.println(missingInArithemeticSeries(arr));

        int arr1[] = {15,13,12};
        System.out.println(missingInArithemeticSeries(arr1));

        int arr2[] = {-7,-5,-1,1,3,5,7};
        System.out.println(missingInArithemeticSeries(arr2));

        int arr3[] = {7,5,1,-1,-3,-5,-7};
        System.out.println(missingInArithemeticSeries(arr3));

    }
}
