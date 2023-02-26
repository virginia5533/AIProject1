//import java.util.Scanner;

public class Board {
    private static int[][]  board;
    private static int N = -1;
    int initN;
    int initM;
    int initH;
    private static int M = -1;
    private static int H = -1;

    /**
    * Uses N to create a NxN 2D array with values = 0
    *
    * @param none
    *
    * @return the game board int[N][N]
    */
    
    public int[][] CreateBoard() {
        
        

        // Pre Executable testing input parameters N, M, H

        /*System.out.println("Please enter N M H");
        N = scanner.nextInt();
        M = scanner.nextInt();
        H = scanner.nextInt();*/

        
        board = new int[N][N];
        System.out.println("/** Generating " + N + "x" + N + " Board **/");

        return board;
    }

    /**
    * Mutator for N -size of board
    *
    * @param initN value to be set
    *
    * @return void
    */
    public void SetN(int initN) {
        N = initN;
    }

    /**
    * Mutator for M -number of pieces to connect
    *
    * @param initM value to be set
    *
    * @return void
    */
    public void SetM(int initM) {
        M = initM;
    }

    /**
    * Mutator for H -determines order of player (0 for user first, 1 for AI first)
    *
    * @param initH value to be set
    *
    * @return void
    */
    public void SetH(int initH) {
        H = initH;
    }

    /**
    * Accessor for N -size of board
    *
    * @param none 
    *
    * @return N
    */
    public  int GetN(){
        return N;
    }

    /**
    * Accessor for M -number of pieces to connect
    *
    * @param none 
    *
    * @return M
    */
    public int GetM(){
        return M;
    }

    /**
    * Accessor for H -determines order of player (0 for user first, 1 for AI first)
    *
    * @param none 
    *
    * @return H
    */
    public int GetH(){
        return H;
    }

    /**
    * Mutator for a Board[][] Object
    *
    * @param initboard value to be set
    *
    * @return void
    */
    public void SetBoard(int[][] initboard){
        board = initboard;
    }

     /**
    * Accessor for Board[][] object -determines order of player (0 for user first, 1 for AI first)
    *
    * @param none 
    *
    * @return int[][] array for the board
    */
    public int[][] GetBoard(){
        return board;
    }

    /**
    * //Prints out 2D array with " "
    *
    * @param void
    *
    * @return void
    */
    public void printBoard() {

        for(int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
              System.out.print(board[row][col] + " ");
            }
            System.out.println();
            
          }

    }

}
