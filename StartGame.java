import java.util.Scanner;

public class StartGame extends Main {
    
    public void Gameplay(Board gameBoard, Scanner scanner){

        Boolean gameOver = false;

        while(gameOver == false){

        //Player object
        Player player = new Player();

        //Mutates Board with Player Move
        gameBoard.SetBoard(player.PlayerMove(gameBoard.GetBoard(), gameBoard.GetN(), gameBoard.GetH(), scanner));


        //prints board
        gameBoard.printBoard();

        
    }
}

}
