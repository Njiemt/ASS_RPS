import  java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        String playerMoveA = "";
        String playerMoveB = "";
        String playAgain = "";
        int done = 0;
        Scanner input = new Scanner(System.in);

        do {
            done = 0;
            playerMoveA = "";
            playerMoveB = "";

            do {
                if (done == 0) {
                    IO.println("Player 1 enter your move");
                    playerMoveA = input.nextLine();
                    if (playerMoveA.equalsIgnoreCase("r") ||
                            playerMoveA.equalsIgnoreCase("p") ||
                            playerMoveA.equalsIgnoreCase("s")) {
                        done++;
                    } else {
                        IO.println("Improper value entered please try again with R,P,S");
                    }
                } else if (done == 1) {
                    IO.println("Player 2 enter your move");
                    playerMoveB = input.nextLine();
                    if (playerMoveB.equalsIgnoreCase("r") ||
                            playerMoveB.equalsIgnoreCase("p") ||
                            playerMoveB.equalsIgnoreCase("s")) {
                        done++;
                    } else {
                        IO.println("Improper value entered please try again with R,P,S");
                    }
                }
            } while (done < 2);

            if (playerMoveA.equalsIgnoreCase(playerMoveB) && playerMoveA.equalsIgnoreCase("r")) {
                IO.println("Rock vs Rock it's a Tie!");
            } else if (playerMoveA.equalsIgnoreCase(playerMoveB) && playerMoveA.equalsIgnoreCase("p")) {
                IO.println("Paper vs Paper it's a Tie!");
            } else if (playerMoveA.equalsIgnoreCase(playerMoveB) && playerMoveA.equalsIgnoreCase("s")) {
                IO.println("Scissors vs Scissors it's a Tie!");
            } else if (playerMoveA.equalsIgnoreCase("r") && playerMoveB.equalsIgnoreCase("s")) {
                IO.println("Rock breaks Scissors");
                IO.println("Player 1 wins!");
            } else if (playerMoveA.equalsIgnoreCase("s") && playerMoveB.equalsIgnoreCase("p")) {
                IO.println("Scissors cuts Paper");
                IO.println("Player 1 wins!");
            } else if (playerMoveA.equalsIgnoreCase("p") && playerMoveB.equalsIgnoreCase("r")) {
                IO.println("Paper covers Rock");
                IO.println("Player 1 wins!");
            } else if (playerMoveA.equalsIgnoreCase("s") && playerMoveB.equalsIgnoreCase("r")) {
                IO.println("Rock breaks Scissors");
                IO.println("Player 2 wins!");
            } else if (playerMoveA.equalsIgnoreCase("p") && playerMoveB.equalsIgnoreCase("s")) {
                IO.println("Scissors cuts Paper");
                IO.println("Player 2 wins!");
            } else if (playerMoveA.equalsIgnoreCase("r") && playerMoveB.equalsIgnoreCase("p")) {
                IO.println("Paper covers Rock");
                IO.println("Player 2 wins!");
            }

            IO.println("Would you like to play again? [Y/N]");
            playAgain = input.nextLine();

        } while (playAgain.equalsIgnoreCase("y"));

        IO.println("Thanks for playing!");
    }
}



