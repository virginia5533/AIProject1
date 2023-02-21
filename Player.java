import java.util.Scanner;

public class Player {

    public int[][] PlayerMove(int[][] board, int N, int H){

        Scanner scanner = new Scanner(System.in);

        //valid col is set to false until it is verified as a playable space
        Boolean isValidCol = false;
        int colNum = -1;


        System.out.println("/**Player Move**/");

       while(isValidCol == false){

        System.out.println("Please enter a number between 1 and " + N);


        //scans in user input for the column #, subtracting 1 for the index of 2D array
        colNum = scanner.nextInt()-1;

        //Checks top space of selected column to see if column is full
        if(board[0][colNum] != 0){
            System.out.println("Column is full, please try again.");
            
        }

        //When column is not full and selected column is playable (<= N) the colNum is verified and breaks while loop
        else if((colNum >= 0) && (colNum < N)){
            isValidCol = true;
        }

        
        }//while loop
        scanner.close();


        //loops each row for that column to place player's newest move on top of any previous
        for(int row = N-1; row >= 0; row--){
            if(board[row][colNum] == 0){
                if(H == 0){
                board[row][colNum] = 1;
                break;
                }
                else {
                    board[row][colNum] = 2;
                    break;
                }
            }
            
        }

        
        
        return board;

    }
    
}
