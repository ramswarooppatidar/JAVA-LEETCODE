package string4.com;

public class RemoveVowel {
    public static String removeVOwel(String str){
        StringBuilder result = new StringBuilder();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            char lower = Character.toLowerCase(ch);
            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u'){

            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
       System.out.println(removeVOwel("leetcodeisgood"));
        System.out.println(removeVOwel("HELLO"));
    }
}
