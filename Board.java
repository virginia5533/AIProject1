import java.util.Scanner;

public class Board {
    int[][] board;
    int N = -1;
    int M = -1;
    int H = -1;

    public int[][] CreateBoard() {
        Scanner scanner = new Scanner(System.in);
        

        // Pre Executable testing input parameters N, M, H

        System.out.println("Please enter N M H");
        N = scanner.nextInt();
        M = scanner.nextInt();
        H = scanner.nextInt();

        scanner.nextLine();

        System.out.println(N + " " + M + " " + H);
        board = new int[N][N];

        return board;
    }

    public int GetN(){
        return N;
    }

    public int GetM(){
        return M;
    }

    public int GetH(){
        return H;
    }

}
