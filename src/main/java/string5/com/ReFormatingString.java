package string5.com;

public class ReFormatingString {
    public String reformatOptimized(String s) {
        int charCount = 0;
        int digitCount = 0;

        for(char c : s.toCharArray()){

            // if(Character.isDigit(s.charAt(i)))   this check take time then direct check
            if (c >= '0' && c <= '9'){
                digitCount++;
            }else{
                charCount++;
            }
        }
        // System.out.println("c count "+charCount+" d count :"+digitCount);
        int diff = Math.abs(digitCount - charCount);
        if(diff > 1 ) return "";

        char ch[] = new char[s.length()];

        int charIndex = charCount >= digitCount ? 0 : 1;
        int digitIndex = charCount >= digitCount ? 1 : 0;
        int l = 0;
        for(char c : s.toCharArray()){
            // if(Character.isDigit(c))
            if (c >= '0' && c <= '9') {
                ch[digitIndex] = c;
                digitIndex += 2;
            }else{
                ch[charIndex] = c;
                charIndex += 2;
            }
        }
        return new String(ch);
    }
    public static String reFormate(String s){
        int digitCoiunt = 0;
        int charCount = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                digitCoiunt++;
            }else{
                charCount++;
            }
        }
        if(Math.abs(charCount - digitCoiunt) > 1){
            return "";
        }
        char ch[] = new char[s.length()];
        int a=0;
        int b=0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(digitCoiunt >= charCount){
                    ch[a*2] = c;
                }else{
                    ch[a*2 + 1] = c;
                }
                a++;
            }else{
                if(charCount > digitCoiunt){
                    ch[b*2] = c;
                }else{
                    ch[b*2 + 1]= c;
                }
                b++;
            }
        }
        return new String(ch);
    }
    public String reformat2(String s) {
        int charCount = 0;
        int digitCount = 0;

        for(int i =0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                charCount++;
            }
            if(Character.isDigit(s.charAt(i))){
                digitCount++;
            }
        }
        System.out.println("c count "+charCount+" d count :"+digitCount);
        int diff = Math.abs(digitCount - charCount);
        if(diff > 1 ) return "";

        char ch[] = new char[s.length()];

        int charIndex = charCount >= digitCount ? 0 : 1;
        int digitIndex = charCount >= digitCount ? 1 : 0;
        int l = 0;
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                ch[digitIndex] = c;
                digitIndex += 2;

            }else{
                ch[charIndex] = c;
                charIndex += 2;
            }
        }
        return new String(ch);
    }
    public static void main(String args[]){
        String res = reFormate("a0b1c2");
        System.out.println(res);

        String res1  = reFormate("covid2019");
        System.out.println(res1);

        String res2  = reFormate("covid201987");
        System.out.println(res2);
        /*
        You are given an alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

        You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

        Return the reformatted string or return an empty string if it is impossible to reformat the string.



        Example 1:

        Input: s = "a0b1c2"
        Output: "0a1b2c"
        Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
        Example 2:

        Input: s = "leetcode"
        Output: ""
        Explanation: "leetcode" has only characters so we cannot separate them by digits.
        Example 3:

        Input: s = "1229857369"
        Output: ""
        Explanation: "1229857369" has only digits so we cannot separate them by characters.

         */
    }
}
