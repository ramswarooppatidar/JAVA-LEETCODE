package string5.com;

public class Interprat {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<command.length(); i++){
            char ch = command.charAt(i);
            if(ch == 'G'){
                sb.append(String.valueOf(ch));
            }else if(ch - 'a' <= 26 && ch -'a' >= 0){
                sb.append(String.valueOf(ch));
            }else if(i + 1< command.length() &&
                    ch == '(' && command.charAt(i + 1) == ')'){
                sb.append("o");
            }
        }
        return sb.toString();
    }

    /*
    xample 1:

        Input: command = "G()(al)"
        Output: "Goal"
        Explanation: The Goal Parser interprets the command as follows:
        G -> G
        () -> o
        (al) -> al
        The final concatenated result is "Goal".
        Example 2:

        Input: command = "G()()()()(al)"
        Output: "Gooooal"
        Example 3:

        Input: command = "(al)G(al)()()G"
        Output: "alGalooG"

     */
}
