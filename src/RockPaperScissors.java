import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        boolean userIsDonePlaying = false;
        int gameNumber = 1;

        System.out.println("\uD83E\uDEA8 Rock - \uD83D\uDCC4 Paper - \u2702\uFE0F Scissors!");
        System.out.print("\n");

        do {
            System.out.println("> Game #" + gameNumber);

            do {
                System.out.print("\uD83D\uDD36 Player A | Enter a rock-paper-scissors move (R, P, or S): ");
                playerAMove = consoleIn.nextLine().toUpperCase();

                if (!playerAMove.matches("[RPS]")) {
                    System.out.println("\u26A0️ " + playerAMove + " is an invalid move. Enter R, P, or S");
                }
            } while(!playerAMove.matches("[RPS]"));

            do {
                System.out.print("\uD83D\uDD37 Player B | Enter a rock-paper-scissors move (R, P, or S): ");
                playerBMove = consoleIn.nextLine().toUpperCase();

                if (!playerBMove.matches("[RPS]")) {
                    System.out.println("\u26A0️ " + playerBMove + " is an invalid move. Enter R, P, or S");
                }
            } while(!playerBMove.matches("[RPS]"));


            if (playerAMove.equals("R")) {
                if (playerBMove.equals("R")) {
                    System.out.println("\u27A1️ Rock vs Rock | Tie!");
                } else if (playerBMove.equals("P")) {
                    System.out.println("\u27A1️ Paper covers Rock | Player B wins!");
                } else if (playerBMove.equals("S")) {
                    System.out.println("\u27A1️ Rock breaks Scissors | Player A wins!");
                }
            } else if (playerAMove.equals("P")) {
                if (playerBMove.equals("R")) {
                    System.out.println("\u27A1️ Paper covers Rock | Player A wins!");
                } else if (playerBMove.equals("P")) {
                    System.out.println("\u27A1️ Paper vs Paper | Tie!");
                } else if (playerBMove.equals("S")) {
                    System.out.println("\u27A1️ Scissors cuts Paper | Player B wins!");
                }
            } else if (playerAMove.equals("S")) {
                if (playerBMove.equals("R")) {
                    System.out.println("\u27A1️ Rock breaks Scissors | Player B wins!");
                } else if (playerBMove.equals("P")) {
                    System.out.println("\u27A1️ Scissors cuts Paper | Player A wins!");
                } else if (playerBMove.equals("S")) {
                    System.out.println("\u27A1️ Scissors vs Scissors | Tie!");
                }
            }

            System.out.print("\n");
            System.out.print("Enter Y to play again: ");
            String playAgainYN = consoleIn.nextLine().toUpperCase();
;
            //if the user doesn't enter Y
            if (!playAgainYN.equals("Y")) {
                userIsDonePlaying = true;
            }

            gameNumber++;
        } while (!userIsDonePlaying);

        System.out.println("\nThanks for playing!");
    }
}