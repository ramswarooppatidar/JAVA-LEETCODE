package string5.easy;

public class HalvAreAlike {
    public boolean halvesAreAlike(String s) {
        int left = 0;
        int right = s.length() - 1;
        int v1 = 0;
        int v2 = 0;
        while(left < right){
            char ch = s.charAt(left);
            char ch2 = s.charAt(right);
            if(isVowel(ch)){
                v1++;
            }
            if(isVowel(ch2)){
                v2++;
            }

            left++;
            right--;
        }
        return v1 == v2;
    }

    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
/*
Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 */
