package string7.com;

public class checkDigitAScending {
    public static boolean areNumbersAscending(String s){
        int digit = 0;
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    int val = Character.getNumericValue(s.charAt(i));
                    num = num*10 + val;
                    i++;
                }
                if(digit < num){
                    digit = num;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean areNumbersAscending1(String s){
       String str[] = s.split("\\s+");
       int digit = 0;
       for(int i =0; i< str.length; i++){
           try{
               int val = Integer.parseInt(str[i]);
               if(digit < val){
                   digit = val;
               }else{
                   return false;
               }
           }
//           catch (Exception e){
//               System.out.println("message :"+ e.getMessage());
//           }
//           catch (ClassCastException e){
//               System.out.println("message :"+ e.getMessage());
//           }
             catch (NumberFormatException e){
                 System.out.println("message :"+ e.getMessage());
             }
       }
       return true;
    }

    public static boolean areNumbersAscending2(String s) {
        int num = 0;
        String str[] = s.split("\\s+");
        for(int i = 0; i<str.length; i++){
            try{
                int digit = Integer.parseInt(str[i]);
                if(num < digit){
                    num = digit;
                }else{
                    return false;
                }
            }catch(Exception e){
                // System.out.println("string is not contains all digits");
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s1 = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        areNumbersAscending(s1);
        areNumbersAscending1(s1);

        String s2 = "hello world 5 x 5";
        areNumbersAscending(s2);
        areNumbersAscending1(s2);

        String s3 = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        areNumbersAscending(s3);
        areNumbersAscending1(s3);

        /*
        A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.

        For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
        Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right (i.e., other than the last number, each number is strictly smaller than the number on its right in s).

        Return true if so, or false otherwise.
        Example 1:

        example-1
        Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
        Output: true
        Explanation: The numbers in s are: 1, 3, 4, 6, 12.
        They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.
        Example 2:

        Input: s = "hello world 5 x 5"
        Output: false
        Explanation: The numbers in s are: 5, 5. They are not strictly increasing.
        Example 3:

        example-3
        Input: s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
        Output: false
        Explanation: The numbers in s are: 7, 51, 50, 60. They are not strictly increasing.
         */
    }
}
