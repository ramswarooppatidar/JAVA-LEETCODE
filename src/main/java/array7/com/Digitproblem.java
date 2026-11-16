package array7.com;

import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Digitproblem {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new TreeSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    if (digits[i] == 0 || digits[k] % 2 != 0) {
                        continue;
                    }

                    int number = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    result.add(number);
                }
            }
        }
        int res[] = new int[result.size()];
        int k = 0;
        for(int i : result){
            res[k++] = i;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
        public static void main(String args[]){
            /*

             */
        }
    }

