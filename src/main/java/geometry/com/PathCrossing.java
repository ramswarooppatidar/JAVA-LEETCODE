package geometry.com;

import java.util.*;

public class PathCrossing {
    /*
    Inside set if i take Set<Integer[]>  then it is wrong way because it is refernce comperrsion,
    instance of that we used Set<List<Intger>   it compare values not contains

    List<Integer[]> l1 = Arrays.asList(new Integer[]{1,2});
        List<Integer[]> l2 = Arrays.asList(new Integer[]{1,2});

        System.out.println(l1.equals(l2)); // ❌ false

👉 Because Integer[] inside is compared by reference
     */
    public boolean isPathCrossing10(String path) {
        /*
        north = (x, y + 1);
        east = (x + 1, y);
        south = (x, y - 1);
        west = (x - 1, y);
        */
        Set<String> visited = new HashSet<>();
        int x =0;
        int y = 0;
        visited.add("0,0");

        for(char ch : path.toCharArray()){
            switch(ch){
                case 'N' : y++; break;
                case 'E' : x++; break;
                case 'S' : y--; break;
                case 'W' : x--; break;
            }
            String key = x +","+y;
            if(!visited.add(key)){
                return true;
            }
        }
        return false;
    }
    public boolean isPathCrossing1(String path) {
        /*
        north = (x, y + 1);
        east = (x + 1, y);
        south = (x, y - 1);
        west = (x - 1, y);
        */
        Set<String> set = new HashSet<>();
        int x =0;
        int y = 0;
        set.add("0,0");
        for(char ch : path.toCharArray()){
            if(ch == 'N')y++;
            else if(ch == 'E')x++;
            else if(ch == 'S')y--;
            else if(ch == 'W')x--;

            String newPos = x+","+y;
            if(set.contains(newPos)){
                return true;
            }
            set.add(newPos);
        }
        return false;
    }
    public boolean isPathCrossing(String path) {
        /*
        north = (x, y + 1);
        east = (x + 1, y);
        south = (x, y - 1);
        west = (x - 1, y);
        */
        Set<List<Integer>> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(Arrays.asList(x, y));
        for(char ch : path.toCharArray()){
            if(ch == 'N')y++;
            else if(ch == 'E')x++;
            else if(ch == 'S')y--;
            else if(ch == 'W')x--;


            if(set.contains(Arrays.asList(x, y))){
                return true;
            }
            set.add(Arrays.asList(x, y));
        }
        return false;
    }
    public boolean isPathCrossing2(String path) {
        /*
        north = (x, y + 1);
        east = (x + 1, y);
        south = (x, y - 1);
        west = (x - 1, y);
        */
        Set<Integer[]> set = new HashSet<>();
        set.add(new Integer[]{0, 0});
        Integer prev[] = {0, 0};
        System.out.println("["+prev[0]+" "+prev[1]+"]");
        for(char ch : path.toCharArray()){
            if(ch == 'N'){
                Integer temp[] = prev;
                prev = new Integer[]{temp[0], temp[1] + 1};
                if(set.contains(prev)){
                    return true;
                }
                System.out.println("["+prev[0]+" "+prev[1]+"]");
                set.add(prev);
            }else if(ch == 'E'){
                Integer temp[] = prev;
                prev = new Integer[]{temp[0] + 1, temp[1]};
                if(set.contains(prev)){
                    return true;
                }
                System.out.println("["+prev[0]+" "+prev[1]+"]");
                set.add(prev);
            }else if(ch == 'S'){
                Integer temp[] = prev;
                prev = new Integer[]{temp[0], temp[1] - 1};
                if(set.contains(prev)){
                    return true;
                }
                System.out.println("["+prev[0]+" "+prev[1]+"]");
                set.add(prev);
            }else{
                Integer temp[] = prev;
                prev = new Integer[]{temp[0] - 1, temp[1]};
                if(set.contains(prev)){
                    return true;
                }
                System.out.println("["+prev[0]+" "+prev[1]+"]");
                set.add(prev);
            }
        }

        return false;
    }

    public static void main(String args[]){
        /*
            Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

            Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.



            Example 1:


            Input: path = "NES"
            Output: false
            Explanation: Notice that the path doesn't cross any point more than once.
            Example 2:


            Input: path = "NESWW"
            Output: true
            Explanation: Notice that the path visits the origin twice.


            Constraints:

            1 <= path.length <= 104
            path[i] is either 'N', 'S', 'E', or 'W'.
         */
    }
}
