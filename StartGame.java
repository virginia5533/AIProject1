public class StartGame extends Main {
    
    public void Gameplay(Board gameBoard){

        //Player object
        Player player = new Player();

        //Mutates Board with Player Move
        gameBoard.SetBoard(player.PlayerMove(gameBoard.GetBoard(), gameBoard.GetN(), gameBoard.GetH()));


        //prints board
        gameBoard.printBoard();

        
    }

}
