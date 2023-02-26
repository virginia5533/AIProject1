import java.util.Scanner;

public class Main {


  /**
 * Creates game board and calls Start Game.
 *
 * @param args String[] for java main function
 *
 * @return void
 */
  public static void main(String[] args) {


    //create scanner object
    Scanner scanner = new Scanner(System.in);

    //create gameBoard object
    Board gameBoard = new Board();
    StartGame game = new StartGame();
    
    

    System.out.println(
        "+====================================================+\n" +
            "|    _____                            _     __  __   |\n" +
            "|   / ____|                          | |   |  \\/  |  |\n" +
            "|  | |     ___  _ __  _ __   ___  ___| |_  | \\  / |  |\n" +
            "|  | |    / _ \\| '_ \\| '_ \\ / _ \\/ __| __| | |\\/| |  |\n" +
            "|  | |___| (_) | | | | | | |  __/ (__| |_  | |  | |  |\n" +
            "|   \\_____\\___/|_| |_|_| |_|\\___|\\___|\\__| |_|  |_|  |\n" +
            "|                                                    |\n" +
            "+====================================================+\n");

  //scans in connectM
  scanner.next();

  //created variable for input N from user input
  //calls setter for N
  int userN = scanner.nextInt();
  gameBoard.SetN(userN);

  //created variable for input M from user input
  //calls setter for M
  int userM = scanner.nextInt();
  gameBoard.SetM(userM);

  //created variable for input H from user input
  //calls setter for H
  int userH = scanner.nextInt();
  gameBoard.SetH(userH);


  //calls Board object function CreateBoard
  gameBoard.CreateBoard();

  //calls Board object function printBoard
  gameBoard.printBoard();


  //begins moves with StartGame function Gameplay with the Board created
  game.Gameplay(gameBoard, scanner);

  

  scanner.close();



  }
}