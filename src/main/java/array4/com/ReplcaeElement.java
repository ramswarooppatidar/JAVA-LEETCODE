package array4.com;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReplcaeElement {
    public static int[] replaceElementsWithGreatestOnRight2(int arr[]){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = n - 1; i>=0; i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                arr[i] = -1;
            }else{
                if(arr[i] > stack.peek()){
                    int top = stack.pop();
                    int temp = arr[i];
                    arr[i] = top;
                    stack.push(temp);
                }else{
                    arr[i] = stack.peek();
                }
            }
        }
        return arr;
    }
    //exceed time complecity
    public static int[] replaceElementsWithGreatestOnRight(int arr[]){
        int n = arr.length;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            maxPQ.add(i);
        }
        for(int i =0; i<n; i++){
            maxPQ.remove(arr[i]);
            if(maxPQ.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = maxPQ.poll();
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {17,18,5,4,6,1};
       replaceElementsWithGreatestOnRight(arr);
       for(int i : arr){
           System.out.print(i+" ");
       }
        System.out.println("");
        replaceElementsWithGreatestOnRight2(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
