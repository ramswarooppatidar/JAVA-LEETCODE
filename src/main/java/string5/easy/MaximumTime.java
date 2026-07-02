package string5.easy;

public class MaximumTime {
    public String maximumTime(String time) {
        char ch[] = time.toCharArray();
        if(ch[0] == '?'){
            if(ch[1] == '?' || ch[1] <= '3'){
                ch[0] = '2';
            }else{
                ch[0] = '1';
            }
        }

        if(ch[1] == '?'){
            if(ch[0] == '2'){
                ch[1] = '3';
            }else{
                ch[1] = '9';
            }
        }

        if(ch[3] == '?'){
            ch[3] = '5';
        }

        if(ch[4] == '?'){
            ch[4] = '9';
        }

        return new String(ch);

    }

    public static void main(String args[]){
        /*
        Example 1:

        Input: time = "2?:?0"
        Output: "23:50"
        Explanation: The latest hour beginning with the digit '2' is 23 and the latest minute ending with the digit '0' is 50.
        Example 2:

        Input: time = "0?:3?"
        Output: "09:39"
        Example 3:

        Input: time = "1?:22"
        Output: "19:22"

         */
    }
}
