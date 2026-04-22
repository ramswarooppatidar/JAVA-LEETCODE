package leetcode.medium.string;

public class RemoveAllOccurance {
    public static String removeAllOccurance(String s, String part){
        int len = part.length();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(String.valueOf(ch));
            if(sb.length() >= len && sb.substring(sb.length() - len).equals(part)){
                sb.delete(sb.length() - len, sb.length());
            }
        }
        return sb.toString();
    }
    public static String removeAllOccurance2(String s, String part){
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
    public static void main(String args[]){
        /*
        Input: s = "daabcbaabcbc", part = "abc"
        Output: "dab"
        Explanation: The following operations are done:
        - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
        - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
        - s = "dababc", remove "abc" starting at index 3, so s = "dab".
        Now s has no occurrences of "abc".
         */
    }
}
