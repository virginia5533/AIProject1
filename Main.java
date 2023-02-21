import java.util.Scanner;

public class Main {

  

  public static void main(String[] args) {


    //create scanner object
    Scanner scanner = new Scanner(System.in);

    //create gameBoard object
    Board gameBoard = new Board();
  
    Boolean gameOver = false;
    Boolean validPlay = false;
    
    

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

  //System.out.print(Board.GetN() + " " + Board.GetM() + " " + Board.GetH());

  //calls Board object function CreateBoard
  gameBoard.CreateBoard();

  //calls Board object function printBoard
  gameBoard.printBoard();

  scanner.close();

/*
  
  /*System.out.println(M);
  boardArray = new int[M][M];
  printArray(boardArray, M);
  
  System.out.println();














  System.out.println("Alright! Make the first move by entering the column number:");
  while(!gameOver){
  

  do {

    System.out.println("*PLAYER MOVE*");
    int playColumn = scanner.nextInt();
    scanner.nextLine();

    if(playColumn < M){
        validPlay = true;
    }
    else {
        System.out.println("Sorry, that column is out of range. Pick a column between 1 and " + M);
    }

    
  }while(!validPlay);

  System.out.println("/..Implementing Move../");
  //code to print updated board

  System.out.println("/..AI Processing Move../");

  }//while game loop
           
  scanner.close();
  
}

public static void printArray(int[][] boardArr, int M){

  for(int j = 0; j < M; j++){
    for(int i = 0; i < M; i++){
      System.out.print(boardArr[i][j]);
    }
    System.out.println();
    
  }

}

}

*/

  }
}