public class CheckWin {
    
    public boolean CheckForWin(int[][] board, char player, int M) {

        int checkM = 0;
        for(int col = M; col > 0; col--){

        for(int row = M; row > 0; row--){

            if(board[row][col] == player){
                checkM ++;
            }
            else{
                checkM = 0;
            }



        }
        if(checkM == M){
            return true;
        }
    }

        return false;
    }

}
