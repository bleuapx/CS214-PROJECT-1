import java.util.Scanner;

class Main {
   public static void main(String[]args) {
   
      //Get the users input
      Scanner in = new Scanner(System.in);

      //Loop through and keep asking the user to enter a move
      while(true) {

        System.out.println("Enter your move. Type in rock, paper, scissors, lizard, or spock. If you want to exit the game, type in quit. ");
        String myMove = in.nextLine();

        //Check if the user typed quit
        if(myMove.equals("quit")) {
          break;
        }

        //Verify that my move is valid
        if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors") && !myMove.equals("lizard") && !myMove.equals("spock")) {
        System.out.println("Your move isn't valid!");
        } else {
        
        //Randomly generate the opponents move (0, 1, 2, 3, 4)
        int rand = (int)(Math.random() * 5);
        String opponentMove = "";
        if(rand == 0) {
        opponentMove = "rock";
        } else if(rand == 1) {
          opponentMove = "paper";
        } else if(rand == 2) {
          opponentMove = "scissors";
        } else if(rand == 3) {
          opponentMove = "lizard";
        } else {
        opponentMove = "spock";
        }
        System.out.println("Opponent move: " + opponentMove);

        //Calculate if the user won, lost, or tied
        if(myMove.equals(opponentMove)) {
          System.out.println("You tied!");
        } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock")) || (myMove.equals("rock") && opponentMove.equals("lizard")) || (myMove.equals("lizard") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("spock")) || (myMove.equals("spock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("lizard")) || (myMove.equals("lizard") && opponentMove.equals("spock")) || (myMove.equals("spock") && opponentMove.equals("rock"))) {
          System.out.println("You won!");
        } else {
          System.out.println("You lost!");
        }
      }
    }

    System.out.println("Thanks for playing! :)");

  }
}