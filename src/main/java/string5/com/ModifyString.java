package string5.com;

public class ModifyString {
    public static String modifyString(String s) {
        int index[] = new int[26];
        String result = "";
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '?') continue;
            index[ch - 'a']++;
        }

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '?'){
                if(i - 2 >= 0 && s.charAt(i - 2) != '?'){
                    int ind = s.charAt(i - 2) - 'a';
                    result += (char) ('a' + ind);
//                    char check = (char) ('a' + ind);
//                    if(check != s.charAt(i - 1) && check != s.charAt(i + 1) && i + 1 < s.length()){
//                        result += (char) ('a' + ind);
//                    }

                }else if(i + 2 < s.length() && s.charAt(i + 2) != '?'){
                    int ind = s.charAt(i+ 2)-'a';
                    result += (char) ('a' + ind);
//                    char check = (char) ('a' + ind);
//                    if(i - 1 >=0 && check != s.charAt(i - 1) && check != s.charAt(i + 1)) {
//                        result += (char) ('a' + ind);
//                    }
                }else{
                    for(int k =0; k<26; k++){
                        if(index[k] == 0){
                            result += (char) ('a' + k);
                            index[k]++;
                            break;
                        }
                    }
                }

            }else{
                result += ch;
            }
        }
        return result;
    }
    public static String modifyString2(String s){
        StringBuilder result = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '?'){
                for(char c = 'a'; c <= 'z'; c++){
                    char prev = result.length() > 0 ? result.charAt(result.length() - 1) : '#';
//                    char next = (i + 1)>=result.length() ? result.charAt(i + 1) : '#';
                    char next = (i + 1 < s.length()) ? s.charAt(i + 1) : '#';
                    if(c != prev && c != next){
                        result.append(String.valueOf(c));
                        break;
                    }
                }
            }else{
                result.append(String.valueOf(ch));
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        System.out.println("ix?ft?f?" + " output :"+ modifyString("ix?ft?f?"));

        System.out.println("???" + " output :"+ modifyString("???"));
        System.out.println("?a" + " output :"+ modifyString("?a"));
        System.out.println("?a?" + " output :"+ modifyString("?a?"));
        System.out.println("?abcdefghijk?lmnopqrstuvwxyz?" + " output :"+ modifyString("?abcdefghijk?lmnopqrstuvwxyz?"));

        System.out.println("*****************************************************************");
        System.out.println("ix?ft?f?" + " output :"+ modifyString2("ix?ft?f?"));

        System.out.println("???" + " output :"+ modifyString2("???"));
        System.out.println("?a" + " output :"+ modifyString2("?a"));
        System.out.println("?a?" + " output :"+ modifyString2("?a?"));
        System.out.println("?abcdefghijk?lmnopqrstuvwxyz?" + " output :"+ modifyString2("?abcdefghijk?lmnopqrstuvwxyz?"));

    }
}
