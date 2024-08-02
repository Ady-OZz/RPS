import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        List<String> rps = Arrays.asList("Rock", "Paper", "Scissors");
        
        while (true) {
            System.out.println("Enter move (Rock, Paper, or Scissors). To exit the game, type \"exit\": ");
            String playerMove = scanner.nextLine();

            if (playerMove.equalsIgnoreCase("exit")) {
                System.out.println("Game exited.");
                break;
            }

            if (!rps.contains(playerMove)) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            String computerMove = rps.get(random.nextInt(rps.size()));
            System.out.println("Computer move: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock")) {
                if (computerMove.equals("Scissors")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equalsIgnoreCase("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equalsIgnoreCase("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }
        
        scanner.close();
    }
}
