import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Boolean verifyM = false;
    Boolean gameOver = false;
    Boolean validPlay = false;
    String answer = "";
    int M = -1;

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

 do {   
       
  
  System.out.println("Please enter how big you would like the board in the form of ONE integer\n" + "(For example, 3 generates 3 x 3) ");
  M = scanner.nextInt();
  
  scanner.nextLine();

  for(int i = 0; i < M*2 + 1; i++){
    System.out.print("-");
  }
  System.out.println("");
  for(int i = 0; i < M; i++){
  for(int x = 0; x < M; x++){
    System.out.print("| ");
  }
  System.out.println("|");
  for(int y = 0; y < M*2+1; y++){
    System.out.print("-");
  }
  System.out.println("");
  }
  
  System.out.println("Is a " + M + " x " + M + " board ok? (y/n):");
  
  answer = scanner.nextLine();
  

  if(answer.equals("yes") == true){
  
    verifyM = true;
     
    
  }

} while(!verifyM);
  /*System.out.println(M);*/

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

  }//while game loop
           
  scanner.close();
  
}

}