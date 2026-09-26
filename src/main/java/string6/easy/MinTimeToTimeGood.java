package string6.easy;

public class MinTimeToTimeGood {
    public static int minTimeToTime(String word){
        int totalDistance = 26;
        int time = 0;
        char pointer = 'a';
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            int distance = Math.abs(ch - pointer);
            if(distance >= 13){
                distance = totalDistance - distance;
            }
            time += distance + 1;
            pointer = ch;
        }
        return time;
    }
    public static void main(String args[]){
        System.out.println(minTimeToTime("abc"));
        System.out.println(minTimeToTime("bza"));
        System.out.println(minTimeToTime("zjpc"));
        /*
        Each second, you may perform one of the following operations:

        Move the pointer one character counterclockwise or clockwise.
        Type the character the pointer is currently on.
        Given a string word, return the minimum number of seconds to type out the characters in word.



        Example 1:

        Input: word = "abc"
        Output: 5
        Explanation:
        The characters are printed as follows:
        - Type the character 'a' in 1 second since the pointer is initially on 'a'.
        - Move the pointer clockwise to 'b' in 1 second.
        - Type the character 'b' in 1 second.
        - Move the pointer clockwise to 'c' in 1 second.
        - Type the character 'c' in 1 second.
        Example 2:

        Input: word = "bza"
        Output: 7
        Explanation:
        The characters are printed as follows:
        - Move the pointer clockwise to 'b' in 1 second.
        - Type the character 'b' in 1 second.
        - Move the pointer counterclockwise to 'z' in 2 seconds.
        - Type the character 'z' in 1 second.
        - Move the pointer clockwise to 'a' in 1 second.
        - Type the character 'a' in 1 second.
        Example 3:

        Input: word = "zjpc"
        Output: 34
        Explanation:
        The characters are printed as follows:
        - Move the pointer counterclockwise to 'z' in 1 second.
        - Type the character 'z' in 1 second.
        - Move the pointer clockwise to 'j' in 10 seconds.
        - Type the character 'j' in 1 second.
        - Move the pointer clockwise to 'p' in 6 seconds.
        - Type the character 'p' in 1 second.
        - Move the pointer counterclockwise to 'c' in 13 seconds.
        - Type the character 'c' in 1 second.

         */
    }
}
