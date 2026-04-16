package string5.com;

public class MakeGood {

    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        char ch = 'a';
        for(int i = 1; i<s.length(); i++){
            if(!sb.isEmpty()){
                ch = sb.charAt(sb.length() - 1);
            }else{
                System.out.println("first else add "+s.charAt(i));
                sb.append(s.charAt(i));
                continue;
            }

            if(ch == s.charAt(i) + 32 || ch == s.charAt(i) - 32){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                System.out.println("else add "+s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String makeGood2(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        char ch =s.charAt(0);
        for(int i = 1; i<s.length(); i++){
            System.out.println("ch :"+s.charAt(i));
            if(!sb.isEmpty()){
                ch = sb.charAt(sb.length() - 1);
                System.out.println("ch :"+ch);
            }else{
                System.out.println("empty string "+sb.length());
                sb.append(s.charAt(i));
                continue;
            }

             if(ch == s.charAt(i) + 32 || ch == s.charAt(i) - 32){
//                System.out.println("first condition "+s.charAt(i));
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
//                System.out.println("third condition");
                sb.append(s.charAt(i));
            }
            System.out.println(sb.toString());
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String test = "lEeeetcode";
        System.out.println(makeGood(test));

        String test1 = "aABbCc";
        System.out.println("Result :"+makeGood(test1));
        System.out.println("------------");

        String test2 = "GwqQWgghHGEREIwlWiere";
        System.out.println("Result :"+makeGood(test2));
        /*
        Given a string s of lower and upper case English letters.

        A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

        0 <= i <= s.length - 2
        s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
        To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

        Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

        Notice that an empty string is also good.

        Example 1:
        Input: s = "leEeetcode"
        Output: "leetcode"
        Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
        Example 2:

        Input: s = "abBAcC"
        Output: ""
        Explanation: We have many possible scenarios, and all lead to the same answer. For example:
        "abBAcC" --> "aAcC" --> "cC" --> ""
        "abBAcC" --> "abBA" --> "aA" --> ""
        Example 3:

        Input: s = "s"
        Output: "s"

         */
    }
}
