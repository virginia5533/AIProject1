public class CheckWin {
    int[][] board;
    int player;
    int M, N;

    public CheckWin(int[][] board, int player, int M, int N) {
        this.board = board;
        this.player = player;
        this.M = M;
        this.N = N;
    }

    public boolean CheckForWin() {

        if (CheckVertical() || CheckHorizontal() || CheckDiagonalLeftToRight() || CheckDiagonalRightToLeft()) {
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

    private boolean CheckDiagonalLeftToRight() {
        // Check for Diagonal win top left to bottom right
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

    private boolean CheckDiagonalRightToLeft() {
        // Check for diagonal win bottom left to top right
        for (int row = N - 1; row >= M - 1; row--) {
            for (int col = 0; col <= board[0].length - M; col++) {
                int checkM = 0;
                for (int i = 0; i < M; i++) {
                    if (board[row - i][col + i] == player) {
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
