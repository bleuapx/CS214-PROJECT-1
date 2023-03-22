import java.util.Scanner;

class Main {
   public static void main(String[]args) {
   
      //Get the users input
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your move. Type in rock, paper, scissors, lizard, or spock: ");
      String myMove = in.nextLine();
      
      //Verify that my move is valid
      if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
      System.out.println("Your move isn't valid!");
      } else {
      
        //Randomly generate the opponents move (0, 1, 2, 3, 4)
      int rand = (int)(Math.random() * 5);
      String opponentMove = "";
      if(rand == 0) {
       opponentMove = "rock";
      } else if(rand == 1) {
        opponentMove = "paper";
      } else {
        opponentMove = "scissors";
      }
      System.out.println("Opponent move: " + opponentMove);

      //Calculate if the user won, lost, or tied
      if(myMove.equals(opponentMove)) {
        System.out.println("You tied!:");
      } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
        System.out.println("You won!");
      } else {
        System.out.println("You lost!");
      }
    }
  }
}