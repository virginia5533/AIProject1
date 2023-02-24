import java.util.Scanner;

public class Player {
    
    // valid col is set to false until it is verified as a playable space
    Boolean isValidCol = false;
    int colNum = -1;

    public int[][] PlayerMove(int[][] board, int N, int H, char isAI, Scanner scanner) {

        
        
         // while loop
        isValidInput(isAI, board, N, scanner);

        // loops each row for that column to place player's newest move on top of any
        // previous
        for (int row = N - 1; row >= 0; row--) {
            if (board[row][colNum] == 0) {
                // if player moved first
                board[row][colNum] = H +1;
                break;
            }

        }

        // scanner.close();
        return board;

    }

    public void isValidInput(char isAI, int[][] board, int N, Scanner scanner){

        int input;

        while ((isValidCol == false)) {

            if(isAI == 'N'){

            System.out.println("Please enter a number between 1 and " + N);

            // while loop ensures a number between 1 and N is input
            // scans in user input for the column #, subtracting 1 for the index of 2D array
            while ((!scanner.hasNextInt())) {
                System.out.println("Please enter a number between 1 and " + N);
                scanner.next();
            }
             input = scanner.nextInt() - 1;

            }//User player

            else{
                System.out.println("/**AI Processing Move**/");
                //Implement alpha beta pruning and delete input = 1 below
                input = 1;
              }

            if (input < 0 || input >= N) {
                System.out.println("Number is out of range, please enter a number between 1 and " + N);
                continue;
            }
            // Checks top space of selected column to see if column is full

            else {
                if (board[0][input] != 0) {
                    System.out.println("Column is full");
                } else {
                    colNum = input;
                    isValidCol = true;
                }
            }
          



        }//while loop

        
    }

}
