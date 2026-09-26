package string6.easy;

public class GetLuckyNumber {
    public int getLucky2(String s, int k) {
        int sum = 0;
        int sum2 = 0;
        //failed   "dbvmfhnttvr"  -> "422213681420202218"
        for(int i = 0; i<s.length(); i++){
            int num = s.charAt(i) - 'a' + 1;
            sum = sum*10 + num;
        }
        System.out.println("sum :"+sum);
        int newSum = 0;
        while(k > 0){
            newSum = 0;
            while(sum > 0){
                newSum += sum % 10;
                sum /= 10;
            }
            System.out.println("newSum :"+newSum);
            sum = newSum;
            k--;
        }

        return newSum;
    }


    // passed like such case  "avgsdhjjskajhs" -> 122723413992314110821"
    public int getLucky(String s, int k) {
        // at that time calculate sum
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            int num = s.charAt(i) - 'a' + 1;
            if(num < 10){
                sum += num;
            }else{
                sum = sum + num/10;
                sum = sum + num % 10;
            }
        }
        k--;
        while(k > 0){
            int newSum = 0;
            while(sum > 0){
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
            k--;
        }
        return sum;
    }
    public static void main(String args[]){
        /*
        For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the
        following operations:

        Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
        Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
        Transform #2: 17 ➝ 1 + 7 ➝ 8
        Return the resulting integer after performing the operations described above.

        Example 1:
        Input: s = "iiii", k = 1
        Output: 36

        Explanation:

        The operations are as follows:
        - Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
        - Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
        Thus the resulting integer is 36.

        Example 2:

        Input: s = "leetcode", k = 2

        Output: 6

        Explanation:

        The operations are as follows:
        - Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
        - Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
        - Transform #2: 33 ➝ 3 + 3 ➝ 6
        Thus the resulting integer is 6.

        Example 3:

        Input: s = "zbax", k = 2

        Output: 8


         */
    }
}
