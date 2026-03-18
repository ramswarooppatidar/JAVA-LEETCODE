package maths.com;

import java.util.HashMap;
import java.util.Map;

public class Hexspeak {
    public  static String hexspeakString(String num){
        int n = Integer.parseInt(num);

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        while(n > 0){
            int rem = n % 16;
            if(rem < 10){
                sb.append(rem);
            }else{
                sb.append((char) ('A' + rem - 10));
            }
            n /= 16;
        }
        sb.reverse();
        for(char ch : sb.toString().toCharArray()){
            if(ch >= '2' && ch <= '9'){
                return "ERROR";
            }else if(ch == '0'){
                result.append('O');
            }else if(ch == '1'){
                result.append('I');
            }else{
                result.append(ch);
            }
        }
        return result.toString();

    }
    public  static String hexspeakString2(String num){
        int n = Integer.parseInt(num);
        Map<Integer, Character> map = new HashMap<>();
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'C');
        map.put(13, 'D');
        map.put(14, 'E');
        map.put(15, 'F');
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        while(n > 0){
            int rem = n % 16;
            if(map.containsKey(rem)){
                Character ch = map.get(rem);
                sb.append(ch);
            }else {
                sb.append(rem);
            }
            n /= 16;
        }
        sb.reverse();
        for(char ch : sb.toString().toCharArray()){
            if(ch >= '2' && ch <= '9'){
                return "ERROR";
            }else if(ch == '0'){
                result.append('O');
            }else if(ch == '1'){
                result.append('I');
            }else{
                result.append(ch);
            }
        }
        return result.toString();

    }
    public static void main(String args[]){
        System.out.println(hexspeakString("257"));

//        System.out.println(hexspeakString("3"));

        System.out.println(hexspeakString("65535"));
        /*
        Problem Description

        You are given a decimal number as a string num.

        You must:

        Convert the number from decimal (base-10) to hexadecimal (base-16).

        After conversion, transform the hexadecimal string into Hexspeak using these rules:

        Hex Digit	Replace With
        0	O
        1	I
        A–F	Keep same
        2–9	❌ Invalid

        If the hexadecimal representation contains any digit 2–9, return:

        ERROR

        Otherwise return the Hexspeak string.
         */
    }
}
