package string4.com;

public class ReformateString {
    public String reformat(String s) {
        for(int i =0; i<s.length() - 1; i++){
            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(i+1))){
                return "";
            }
            if(Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i+1))){
                return "";
            }
        }
        char ch[] = new char[s.length()];
        String temp="";
        for(int i =0; i<s.length();i++){
            temp = s.charAt(i)+temp;
        }
        return temp;
    }
    public static void main(String args[]){
        /*

         */
    }
}
