public class CheckWin {
    int[][] board;
    char player;
    int M, N;

    public CheckWin(int[][] board, char player, int M, int N) {
        this.board = board;
        this.player = player;
        this.M = M;
        this.N = N;
    }

    public boolean CheckForWin() {

        if (CheckVertical() || CheckHorizontal() || CheckDiagonal()) {
            return true;
        } else {
            return false;
        }

    }

    private boolean CheckVertical() {

        // Check for vertical win
        for (int col = 0; col < N; col++) {
            int checkM = 0;
            for (int row = 0; row < N; row++) {

                if (board[row][col] == player) {
                    checkM++;
                    if (checkM == M) {
                        return true;
                    }
                } else {
                    checkM = 0;
                }

            }

        }
        return false;
    }

    private boolean CheckHorizontal() {
        // Check for Horizontal win
        for (int row = 0; row < N; row++) {
            int checkM = 0;
            for (int col = 0; col < N; col++) {

                if (board[row][col] == player) {
                    checkM++;
                    if (checkM == M) {
                        return true;
                    }
                } else {
                    checkM = 0;
                }

            }

        }
        return false;
    }

    private boolean CheckDiagonal() {
        // Check for Diagonal win
        for (int row = 0; row <= N - M; row++) {
            for (int col = 0; col <= N - M; col++) {
                int checkM = 0;
                for (int i = 0; i < M; i++) {
                    if (board[row + i][col + i] == player) {
                        checkM++;
                        if (checkM == M) {
                            return true;
                        }
                    } else {
                        checkM = 0;
                    }
                }
            }
        }

        return false;
    }

}
