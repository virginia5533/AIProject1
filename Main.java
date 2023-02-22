import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

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

    /* System.out.println(M); */
    boardArray = new int[M][M];
    printArray(boardArray, M);

    System.out.println();

    System.out.println("Alright! Make the first move by entering the column number:");
    while (!gameOver) {

      do {

        System.out.println("*PLAYER MOVE*");
        int playColumn = scanner.nextInt();
        scanner.nextLine();

        if (playColumn < M) {
          validPlay = true;
        } else {
          System.out.println("Sorry, that column is out of range. Pick a column between 1 and " + M);
        }

      } while (!validPlay);

      System.out.println("/..Implementing Move../");
      // code to print updated board

      System.out.println("/..AI Processing Move../");

    } // while game loop

    scanner.close();

  }

  public static void printArray(int[][] boardArr, int M) {

    for (int j = 0; j < M; j++) {
      for (int i = 0; i < M; i++) {
        System.out.print(boardArr[i][j]);
      }
      System.out.println();

    }

  }

}