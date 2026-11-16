package string6.easy;

import java.util.ArrayList;
import java.util.List;

public class MinMoveGood {
    public static int minimumMoves(String s){
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'X'){
                count++;
                i += 2;
            }
        }
        return count;
    }
    public int minimumMoves2(String s) {
        int count = 0;
        for(int i =0; i<s.length() - 2; i++){
            // if(s.charAt(i) == 'O') continue;
            if(s.substring(i, i + 3).contains("X")){
                count++;
            }
        }
        // if(s.length() % 3 != 0 && (s.charAt(s.length() - 1) == 'X' || s.charAt(s.length() - 2) == 'X')) count++;
        return count;
    }
    public static void main(String args[]){
        List<byte[]> memory = new ArrayList<>();
        int i =0;
        try{
            while (i<100000) {
                // Allocate 1 MB continuously
                memory.add(new byte[1024 * 1024]);
                System.out.println("Allocated: " + memory.size() * 10 + " MB");
                i++;
            }
        }
//        catch (Exception e){
//            memory = new ArrayList<>();
//        }
        catch (OutOfMemoryError e) {
            System.out.println("OOM occurred");
        }


        String s="XX0X";  //        "OXOOX", "OXOX";
        System.out.println(minimumMoves(s));

        String s1="OXOOX";  //        "OXOOX", "OXOX";
        System.out.println(minimumMoves(s1));

        String s2="OXOX";  //        "OXOOX", "OXOX";
        System.out.println(minimumMoves(s1));

        String s3="XXX";  //        "OXOOX", "OXOX";
        System.out.println(minimumMoves(s));

        String s4="0000";  //        "OXOOX", "OXOX";
        System.out.println(minimumMoves(s));
        /*
        You are given a string s consisting of n characters which are either 'X' or 'O'.

        A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.

        Return the minimum number of moves required so that all the characters of s are converted to 'O'.



        Example 1:

        Input: s = "XXX"
        Output: 1
        Explanation: XXX -> OOO
        We select all the 3 characters and convert them in one move.
        Example 2:

        Input: s = "XXOX"
        Output: 2
        Explanation: XXOX -> OOOX -> OOOO
        We select the first 3 characters in the first move, and convert them to 'O'.
        Then we select the last 3 characters and convert them so that the final string contains all 'O's.
        Example 3:

        Input: s = "OOOO"
        Output: 0
        Explanation: There are no 'X's in s to convert.
         */
    }
}
