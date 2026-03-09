package string4.com;

public class DefengIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch == '.'){
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String arg[]){
        /*
        Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

         */
    }
}
