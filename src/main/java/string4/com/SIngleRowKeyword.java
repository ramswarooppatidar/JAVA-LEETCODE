package string4.com;

public class SIngleRowKeyword {
    public static int calculateTime(String keyboard, String word){
        StringBuilder sb = new StringBuilder();
        for(char ch : keyboard.toCharArray()){
            sb.append(ch);
        }
        int cost = 0;
        for(int i = 0; i<word.length(); i++){
            if(i == 0){
                cost += sb.indexOf(String.valueOf(word.charAt(i)));
            }else{
                int index1 = sb.indexOf(String.valueOf(word.charAt(i)));
                int index2 = sb.indexOf(String.valueOf(word.charAt(i - 1)));
                int absDiff = Math.abs(index1 - index2);
//                System.out.println("absDiff :"+absDiff);
                cost += absDiff;
//                System.out.println("cost :"+cost);
            }

        }
        return cost;
    }
    public static int calculateTime2(String keyboard, String word){

        int cost = 0;
        for(int i = 0; i<word.length(); i++){
            if(i == 0){
                cost += keyboard.indexOf((word.charAt(i)));
            }else{
                int index1 = keyboard.indexOf((word.charAt(i)));
                int index2 = keyboard.indexOf((word.charAt(i - 1)));
                int absDiff = Math.abs(index1 - index2);
//                System.out.println("absDiff :"+absDiff);
                cost += absDiff;
//                System.out.println("cost :"+cost);
            }

        }
        return cost;
    }
    public static int calculateTime3(String keyboard, String word){

        int cost = 0;

        for(int i = 0; i < word.length(); i++){

            int index1 = keyboard.indexOf(word.charAt(i));

            if(i == 0){
                cost += index1;
            }
            else{
                int index2 = keyboard.indexOf(word.charAt(i - 1));
                cost += Math.abs(index1 - index2);
            }

        }

        return cost;
    }
    public static int calculateTime4(String keyboard, String word){

        int[] map = new int[26];

        // store index of each character
        for(int i = 0; i < keyboard.length(); i++){
            map[keyboard.charAt(i) - 'a'] = i;
        }

        int cost = 0;
        int position = 0;

        for(char ch : word.toCharArray()){

            int index = map[ch - 'a'];

            cost += Math.abs(index - position);

            position = index;
        }

        return cost;
    }
    public static void main(String args[]){
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(calculateTime(keyboard, "cba"));
        keyboard = "pqrstuvwxyzabcdefghijklmno";
        System.out.println(calculateTime4(keyboard, "leetcode"));
        System.out.println(calculateTime3(keyboard, "leetcode"));
        System.out.println(calculateTime2(keyboard, "leetcode"));
        System.out.println(calculateTime(keyboard, "leetcode"));
        System.out.println(calculateTime(keyboard, "cbleetcodea"));

    /*
    Problem: Single-Row Keyboard

        There is a special keyboard where all 26 lowercase English letters
        are arranged in a single row.

        You are given:

        a string keyboard representing the order of keys

        a string word that you want to type

        Initially, your finger is at index 0.

        To type a character, you must move your finger to the index of that character.
        The cost of moving from index i to j is:

        |i - j|

        Return the total time required to type the whole word.

        Example 1

        Input

        keyboard = "abcdefghijklmnopqrstuvwxyz"
        word = "cba"

        Output

        4

        Explanation

        Start position = 0

        type 'c' → index 2 → cost = |0-2| = 2
        type 'b' → index 1 → cost = |2-1| = 1
        type 'a' → index 0 → cost = |1-0| = 1

        Total = 4
        Example 2

        Input

        keyboard = "pqrstuvwxyzabcdefghijklmno"
        word = "leetcode"

        Output

        73
        Constraints
        keyboard.length == 26
        keyboard contains all lowercase letters
        1 <= word.length <= 10^4
        word consists of lowercase letters
     */
    }
}
