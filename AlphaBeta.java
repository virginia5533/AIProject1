public class AlphaBeta {
    
    //how many moves ahead ai will look
    static final int maxDepth = 6;
    int bestMove = -1;
    int aiPlayer, N, M;

    //Constructor to change which piece is the AI
    //EX: 1 if going first, 2 if going second
    public AlphaBeta(int aiPlayer, int N, int M){
        this.aiPlayer = aiPlayer;
        this.N = N;
        this.M = M;
    }

    /**
     * This function is a recursive function to find the best possible move
     * 
     * @param board takes in current board
     * @param depth how far the recursive is going
     * @param alpha the alpha for alphabeta pruning
     * @param beta the beta for alphabeta pruning
     * @param player which player is next move
     * @return alpha or beta depending on board and search, return the col to play
     */
    public int alphabeta(int[][] board, int depth, int alpha, int beta, int player) {
        CheckWin checkWin = new CheckWin(board, player);

        // Base case: the maximum search depth is reached or the game is over
        if (depth == 0 || checkWin.CheckForWin()) {
            return evaluate(board);
        }
        // Recursive case: search all possible moves
        for (int col = 0; col < board.length; col++) {
            if (isValidMove(board, col)) {
                // Make the move and switch players
                int row = makeMove(board, col, player);
                int nextPlayer = (player == 1) ? 2 : 1;
                // Recursive search
                int score = -alphabeta(board, depth - 1, -beta, -alpha, nextPlayer);
                // Undo the move
                undoMove(board, row, col);
                // Alpha-beta pruning
                if (score >= beta) {
                    return beta;
                }
                if (score > alpha) {
                    alpha = score;
                    // Keep track of the best move found so far
                    if (depth == maxDepth) {
                        bestMove = col;
                    }
                }
            }
        }
        // Return the best heuristic value found
        return alpha;
    }
    
    /**
     * this function checks the total possible winning moves
     * @param board takes in current board
     * @return numWins
     */
    public int evaluate(int[][] board) {
        // Count the number of possible winning moves for the AI player
        CheckWin checkWin = new CheckWin(board, aiPlayer, 2, N);
        int numWins = 0;
        for (int col = 0; col < board.length; col++) {
            if (isValidMove(board, col)) {
                int row = makeMove(board, col, aiPlayer);
                if (checkWin.CheckForWin()) {
                    numWins++;
                }

                undoMove(board, row, col);
            }
        }
        return numWins;
    }

    //simple check if valid AI move
    /**
     * 
     * @param board takes in current board
     * @param input takes in input move
     * @return true or false depending if move is legal
     */
    public boolean isValidMove(int[][] board, int input){

        if(board[0][input] != 0 || (input < 0 || input >= board.length)){
            return false;
        } else{
            return true;
        }

    }

    //make move function for AI to place moves
    //Should only be changing this local game board until best move is found
    /**
     * 
     * @param board takes in current board
     * @param col takes in the chosen col
     * @param player takes in which player
     * @return updated board
     */
    public int makeMove(int[][] board, int col, int player){
        int row = board.length -1;
        while(row >= 0 && board[row][col] != 0){
            row--;
        }

        board[row][col] = player;

        return row;
    }
    
    //undo move 
    /**
     * 
     * @param board takes in current board
     * @param row takes in row
     * @param col takes in col
     */
    public void undoMove(int[][]board, int row, int col){
        board[row][col] = 0;
    }

}
