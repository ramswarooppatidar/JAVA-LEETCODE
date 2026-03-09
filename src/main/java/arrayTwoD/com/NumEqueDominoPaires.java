package arrayTwoD.com;

public class NumEqueDominoPaires {
    public int numEquivDominoPairs(int[][] dominoes) {
        int key[] = new int[100];
        int result = 0;
        for(int[] d : dominoes){
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int count = a*10 + b;

            result += key[count];
            System.out.println(result);
            key[count]++;
        }
        return result;
    }
    public int numEquivDominoPairs2(int[][] dominoes) {
        int pair = 0;
        for(int i =0; i<dominoes.length -1 ; i++){
            int arr[] = dominoes[i];
            for(int j = i + 1; j<dominoes.length; j++){
                int arr2[] = dominoes[j];
                if(arr[0] == arr2[0] && arr[1] == arr2[1] ||
                        arr[1] == arr2[0] && arr[0] == arr2[1]){
                    pair++;
                }
            }
        }
        return pair;
    }
    public static void main(String arg[]){
        /*
        Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].



Example 1:

Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
Example 2:

Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
Output: 3

         */
    }
}
