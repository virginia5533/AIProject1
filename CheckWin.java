public class CheckWin {
    int[][] board;
    int player;
    int M, N;

    /**
    * constructor for check win with board, player, M and N values
    *
    * @param board board object
    * @param player integer value that the player is using to mark spot
    * @param M number of tokens needed to be in a line to win
    * @param N size of the board
    *
    * @return none
    */
    public CheckWin(int[][] board, int player, int M, int N) {
        this.board = board;
        this.player = player;
        this.M = M;
        this.N = N;
    }

    /**
    * constructor for check win with board and player
    *
    * @param board board object
    * @param player integer value that the player is using to mark spot
    *
    * @return none
    */
    public CheckWin(int[][] board, int player){
        this.board = board;
        this.player = player;
    }

    /**
    * function to update the game status if M tokens have been lined up vertically, horizontally, or diagonally
    *
    * @param none
    *
    * @return boolean if true, the player has won and the game is over, if false the game continues
    */
    public boolean CheckForWin() {

        if (CheckVertical() || CheckHorizontal() || CheckDiagonalLeftToRight() || CheckDiagonalRightToLeft()) {
            return true;
        } else {
            return false;
        }

    }

    /**
    * function check if M tokens have been lined up vertically
    *
    * @param none
    *
    * @return boolean if true, the player has stacked M vertically and the game is over, if false the game continues
    */
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

    /**
    * function check if M tokens have been lined up horizontally
    *
    * @param none
    *
    * @return boolean if true, the player has stacked M horizontally and the game is over, if false the game continues
    */
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

    /**
    * function check if M tokens have been lined up diagonally from top left/bottom right
    *
    * @param none
    *
    * @return boolean if true, the player has stacked M diagonally from top left/bottom right and the game is over, if false the game continues
    */
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

    /**
    * function check if M tokens have been lined up diagonally from top right/bottom left
    *
    * @param none
    *
    * @return boolean if true, the player has stacked M diagonally from top right/bottom left and the game is over, if false the game continues
    */
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
