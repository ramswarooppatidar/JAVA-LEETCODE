package string6.easy;

public class CheckIfPanagram {
    public boolean checkIfPangram(String sentence) {
        int index[] = new int[26];
        for(int i =0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            index[ch - 'a']++;
        }
        for(int i =0; i<26; i++){
            if(index[i] == 0){
                return false;
            }
        }
        return true;
    }
}
