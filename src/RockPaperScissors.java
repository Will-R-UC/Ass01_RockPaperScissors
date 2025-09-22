import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        do {
            System.out.print("\uD83D\uDD36 Player A | Enter a rock-paper-scissors move (R, P, or S): ");
            playerAMove = consoleIn.nextLine();
            playerAMove = playerAMove.toUpperCase();

            if (!playerAMove.matches("[RPS]")) {
                System.out.println("!!! " + playerAMove + " is an invalid move. Enter R, P, or S");
            }
        } while(!playerAMove.matches("[RPS]"));

        do {
            System.out.print("\uD83D\uDD37 Player B | Enter a rock-paper-scissors move (R, P, or S): ");
            playerBMove = consoleIn.nextLine();
            playerBMove = playerBMove.toUpperCase();

            if (!playerBMove.matches("[RPS]")) {
                System.out.println("!!! " + playerBMove + " is an invalid move. Enter R, P, or S");
            }
        } while(!playerBMove.matches("[RPS]"));


    }
}