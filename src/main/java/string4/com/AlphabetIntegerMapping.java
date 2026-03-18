package string4.com;

public class AlphabetIntegerMapping {
    public String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){

            if(i + 2 < n && s.charAt(i + 2) == '#'){
                int val = Integer.parseInt(s.substring(i,i+ 2));
                sb.append( (char)('a' + (val - 1)));
                i += 2;
            }else{
                int val = s.charAt(i) - '0';
                sb.append((char)('a' + (val - 1)));
            }
        }


        return sb.toString();
    }
    public String freqAlphabets2(String s) {
        int start = 0;
        int end = start + 2;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        while(end < n){
            if(s.charAt(end) == '#'){
                int val = Integer.parseInt(s.substring(start,end));
                sb.append( (char)('a' + (val - 1)));
                start = end + 1;
                end = start + 2;
            }else{
                if(start == end){
                    end = start + 2;
                }
                sb.append( (char)('a' + Integer.parseInt(String.valueOf(s.charAt(start++))) - 1));

            }
        }

        while(start< n){
            sb.append( (char)('a' + Integer.parseInt(String.valueOf(s.charAt(start++))) - 1));
        }
        return sb.toString();
    }
    public static void main(String args[]){
        /*
        You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

        Characters ('a' to 'i') are represented by ('1' to '9') respectively.
        Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
        Return the string formed after mapping.

        The test cases are generated so that a unique mapping will always exist.

        Example 1:

        Input: s = "10#11#12"
        Output: "jkab"
        Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

        Example 2:

        Input: s = "1326#"
        Output: "acz"
         */
    }
}
