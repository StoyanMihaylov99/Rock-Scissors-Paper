package MyFirstProject;

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! Let's play a game!");
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Great! Now %s chose -> rock, scissors, or paper?%n", name);
        //Step 1 - Player move.
        String player1 = scanner.nextLine();

        if (player1.equals("rock")) {
            System.out.printf("%s your choice is: %s%n", name, player1);
        } else if (player1.equals("scissors")) {
            System.out.printf("%s your choice is: %s%n", name, player1);
        } else if (player1.equals("paper")) {
            System.out.printf("%s your choice is: %s%n", name, player1);
        } else {
            System.out.println("I don't understand this! Let's try again! ^_^");
            player1 = scanner.nextLine();
        }

        //Step 2 - Computer move.

        System.out.println("I chose...");
        Random RandomNum = new Random();
        int upperbound = 3;
        String computerMove = "";
        int computerNumber = RandomNum.nextInt(upperbound);
        switch (computerNumber) {
            case 0:
                computerMove = "paper";
                break;
            case 1:
                computerMove = "scissors";
                break;
            case 2:
                computerMove = "rock";
                break;

        }

        //Step 3 - decide about win/lose.
        if (player1.equals("rock") && computerMove.equals("scissors")) {
            System.out.println("scissors!");
            System.out.println("Oh.. You win! :(");
        } else if (player1.equals("scissors") && computerMove.equals("paper")) {
            System.out.println("paper!");
            System.out.println("Oh.. You win! :(");
        } else if (player1.equals("paper") && computerMove.equals("rock")) {
            System.out.println("rock!");
            System.out.println("Oh.. You win! :(");

        } else if (player1.equals("scissors") && computerMove.equals("rock")) {
            System.out.println("rock!");
            System.out.println("YESS I WINN :P");
        } else if (player1.equals("paper") && computerMove.equals("scissors")) {
            System.out.println("scissors!");
            System.out.println("YESS I WINN :P");
        } else if (player1.equals("rock") && computerMove.equals("paper")) {
            System.out.println("paper!");
            System.out.println("YESS I WINN :P");}
        else {
            System.out.printf("%s!%n",player1);
            System.out.println("Oh.. this game was draw! Let's play again!");



        }
    }
}
