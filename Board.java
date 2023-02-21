import java.util.Scanner;

public class Board {
    private static int[][]  board;
    private static int N = -1;
    int initN;
    int initM;
    int initH;
    private static int M = -1;
    private static int H = -1;

   

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

    public void SetN(int initN) {
        N = initN;
    }

    public void SetM(int initM) {
        M = initM;
    }

    public void SetH(int initH) {
        H = initH;
    }

    public static  int GetN(){
        return N;
    }

    public static int GetM(){
        return M;
    }

    public static int GetH(){
        return H;
    }

    public void SetBoard(int[][] initboard){
        board = initboard;
    }

    public static int[][] GetBoard(){
        return board;
    }

    public void printBoard() {

        for(int col = 0; col < N; col++){
            for(int row = 0; row < N; row++){
              System.out.print(board[row][col]);
            }
            System.out.println();
            
          }

    }

}
