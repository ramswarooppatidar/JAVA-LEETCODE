package string6.easy;

import java.util.HashSet;

public class numDifferentInteger {
    public static int numDifferentIntegers(String word){
        HashSet<String> set = new HashSet<>();
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                StringBuilder sb = new StringBuilder();
                while(i<word.length() && Character.isDigit(word.charAt(i))){
                    sb.append(word.charAt(i));
                    i++;
                }
                int j = 0;
                while(j < sb.length()-1 && sb.charAt(j) == '0'){
                    j++;
                }
                set.add(sb.substring(j));
            }
        }
        return set.size();
    }

    public static int numDifferentIntegers2(String word){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                int sum =0;
                while(i<word.length() && Character.isDigit(word.charAt(i))){
                    sum = sum*10 + Integer.parseInt(String.valueOf(word.charAt(i)));
                    i++;
                }
                set.add(sum);
            }
        }
        return set.size();
    }


    public static void main(String args[]){
        String word = "a123bc34d8ef34";
        System.out.println(numDifferentIntegers(word));
        System.out.println(numDifferentIntegers2(word));

        String word2 = "a1b01c001";
        System.out.println(numDifferentIntegers(word2));
        System.out.println(numDifferentIntegers2(word2));

        String word3 = "a65547822224578899999911234454555535555555993667778920001992gh5563777ghdj2345648890299374542566177838";
        System.out.println(numDifferentIntegers(word3));
        System.out.println(numDifferentIntegers2(word3));

        //this test case is failed with  second method
        String word4 = "035985750011523523129774573439111590559325a1554234973";
        System.out.println(numDifferentIntegers(word4));
        System.out.println(numDifferentIntegers2(word4));
        /*
        You are given a string word that consists of digits and lowercase English letters.

        You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will become " 123  34 8  34". Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".

        Return the number of different integers after performing the replacement operations on word.

        Two integers are considered different if their decimal representations without any leading zeros are different.



        Example 1:

        Input: word = "a123bc34d8ef34"
        Output: 3
        Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
        Example 2:

        Input: word = "leet1234code234"
        Output: 2
        Example 3:

        Input: word = "a1b01c001"
        Output: 1
        Explanation: The three integers "1", "01", and "001" all represent the same integer because
        the leading zeros are ignored when comparing their decimal values.

         */
    }
}
