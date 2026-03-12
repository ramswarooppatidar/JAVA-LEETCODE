package arrayTwoD.com;

public class TicTacToe {
    public static String ticTacToe(int [][] moves){
        int grid[][] = new int[3][3];
        for(int i =0; i<moves.length; i++){
            int r = moves[i][0];
            int c = moves[i][1];
            if(i % 2 == 0){
                grid[r][c] = 1;
            }else{
                grid[r][c] = 2;
            }
        }
        //row check;
        for(int i =0; i<3; i++){
            int a = 0;
            int b = 0;
            for(int j =0; j<3; j++){
                if(grid[i][j] == 1){
                    a++;
                }
                if(grid[i][j] == 1){
                    b++;
                }
            }
            if(a == 3){
                return "A";
            }
            if(b == 3){
                return "B";
            }
        }

        //COL check;
        for(int i =0; i<3; i++){
            int a = 0;
            int b = 0;
            for(int j =0; j<3; j++){
                if(grid[j][i] == 1){
                    a++;
                }
                if(grid[j][i] == 1){
                    b++;
                }
            }
            if(a == 3){
                return "A";
            }
            if(b == 3){
                return "B";
            }
        }

        //digonal main
        int a = 0;
        int b = 0;
        for(int i =0; i<3; i++){
            if(grid[i][i] == 1){
                a++;
            }
            if(grid[i][i] == 2){
                b++;
            }
            if(a == 3){
                return "A";
            }
            if(b == 3){
                return "B";
            }
        }


        //digonal right to left
        a = 0;
        b = 0;
        for(int i =0; i<3; i++){
            if(grid[i][2 - i] == 1){
                a++;
            }
            if(grid[i][2 - i] == 2){
                b++;
            }
            if(a == 3){
                return "A";
            }
            if(b == 3){
                return "B";
            }
        }

        return "DRaw";
    }
}
