package array5.com;

public class Average {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double total = 0.0;
        for(int i : salary){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
            total += i;
        }
        total = total - min - max;
        return total/(salary.length - 2);

    }
    /*
    You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

    Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.



            Example 1:

    Input: salary = [4000,3000,1000,2000]
    Output: 2500.00000
    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
    Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
    Example 2:

    Input: salary = [1000,2000,3000]
    Output: 2000.00000
    Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
    Average salary excluding minimum and maximum salary is (2000) / 1 = 2000


     */
}
