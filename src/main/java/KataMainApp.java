import entity.Match;
import entity.Player;

import java.util.Locale;
import java.util.Scanner;

public class KataMainApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Player 1 name :");
        Player firstPlayer = new Player(scanner.nextLine());

        System.out.print("Enter Player 2 name :");
        String secondPlayerName = scanner.nextLine();
        while (firstPlayer.getPlayerName().equals(secondPlayerName)) {
            System.out.print("Enter Player 2 name different from Player 1 Name:");
            secondPlayerName = scanner.nextLine();
        }
        Player secondPlayer = new Player(secondPlayerName);

        Match match = new Match(firstPlayer, secondPlayer);
        boolean gameOver = false;

        while (!gameOver) {
            System.out.print("Enter 1 for Player 1 or 2 for Player 1 who won the current set (or) enter 'S' to display the score:");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("s") || command.equals("1") || command.equals("2")) {
                switch (command) {
                    case "1":
                        match.addScore(firstPlayer);
                        break;
                    case "2":
                        match.addScore(secondPlayer);
                        break;
                    case "s":
                        match.printPoint();
                        System.out.println("------------------------------");
                        break;
                    default:
                        System.err.println("Error");
                        break;
                }
                if (match.getWinner() != null) {
                    gameOver = true;
                    System.out.println("Player " + match.getWinner().getPlayerName() + " has own the match");
                }
            } else {
                System.out.println("Please enter a valid command");
            }
        }
    }

}
