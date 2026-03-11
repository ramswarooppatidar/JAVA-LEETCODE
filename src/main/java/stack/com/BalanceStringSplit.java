package stack.com;

import java.util.Stack;

public class BalanceStringSplit {
    public static int balancedStringSplit(String s){
        int count = 0;
        Stack<Character> stack = new Stack<>();
        char check = s.charAt(0);
        for(char ch : s.toCharArray()){
            if(check == 'L'){
                if(ch == 'L'){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                        check = 'R';
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    count++;
                }
            }else{
                if(ch == 'R'){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                        check = 'L';
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    count++;
                }
            }
        }
        return  count;
    }
    public static int balancedStringSplit2(String s){
        int balance = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch =='L'){
                balance++;
            }else{
                balance--;
            }

            if(balance == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("RLLLRRLRRRLR"));

        System.out.println("********************************************************");
        System.out.println(balancedStringSplit2("RLRRLLRLRL"));
        System.out.println(balancedStringSplit2("RLRRRLLRLL"));
        System.out.println(balancedStringSplit2("LLLLRRRR"));
        System.out.println(balancedStringSplit2("RLLLLRRRLR"));
        System.out.println(balancedStringSplit2("RLLLRRLRRRLR"));

        /*
        Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

        Given a balanced string s, split it into some number of substrings such that:

        Each substring is balanced.
        Return the maximum number of balanced strings you can obtain.



        Example 1:

        Input: s = "RLRRLLRLRL"
        Output: 4
        Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
        Example 2:

        Input: s = "RLRRRLLRLL"
        Output: 2
        Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
        Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
        Example 3:

        Input: s = "LLLLRRRR"
        Output: 1
        Explanation: s can be split into "LLLLRRRR".


        Constraints:

        2 <= s.length <= 1000
        s[i] is either 'L' or 'R'.
        s is a balanced string.
         */
    }
}
