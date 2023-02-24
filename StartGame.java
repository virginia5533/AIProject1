import java.util.Scanner;

public class StartGame extends Main {

    public void Gameplay(Board gameBoard, Scanner scanner) {

        Boolean gameOver = false;

        while (gameOver == false) {

            // Player object
            Player player = new Player();
            Player aiPlayer = new Player();

            int aiPlayerTurn;
            if (gameBoard.GetH() == 0) {
                aiPlayerTurn = 1;
            } else {
                aiPlayerTurn = 0;
            }

            CheckWin checkWin = new CheckWin(gameBoard.GetBoard(), aiPlayerTurn+1, gameBoard.GetM(), gameBoard.GetN());

            if (gameBoard.GetH() == 0) {
                gameBoard
                        .SetBoard(player.PlayerMove(gameBoard.GetBoard(), gameBoard.GetN(), aiPlayerTurn,'N', scanner));
                gameOver = checkWin.CheckForWin();
                gameBoard.SetH(1);
            } else {
                // Mutates Board with Player Move
                System.out.println("should be ai move");
                gameBoard.SetBoard(
                        aiPlayer.PlayerMove(gameBoard.GetBoard(), gameBoard.GetN(), aiPlayerTurn, 'Y', scanner));
                gameOver = checkWin.CheckForWin();
                gameBoard.SetH(0);

            }

            // prints board
            gameBoard.printBoard();

        }
    }

}
