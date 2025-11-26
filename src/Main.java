import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        System.out.println("1. Enter your own word");
        System.out.println("2. Use a random word");
        System.out.print("Choose an option (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String word = "";

        if (choice == 1) {
            System.out.print("Enter the word to guess: ");
            word = scanner.nextLine().toLowerCase();
        } else {
            int randomNum = (int) (Math.random() * 10);

            if (randomNum == 0) word = "apple";
            else if (randomNum == 1) word = "banana";
            else if (randomNum == 2) word = "orange";
            else if (randomNum == 3) word = "grape";
            else if (randomNum == 4) word = "computer";
            else if (randomNum == 5) word = "keyboard";
            else if (randomNum == 6) word = "java";
            else if (randomNum == 7) word = "battery";
            else if (randomNum == 8) word = "developer";
            else word = "programming";

            System.out.println("A random word has been selected!");
        }

        Hangman game = new Hangman(word);
        while (game.getLives() > 0) {
            game.displayHangman(game.getLives());
            System.out.println("Current word: " + game.getFoundLetters());
            System.out.println("Lives remaining: " + game.getLives());
            System.out.print("Enter a letter: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.length() != 1) {
                System.out.println("Please enter only one letter!");
                continue;
            }

            String result = game.lettersFound(guess);

            if (result.indexOf("_")==-1) {
                System.out.println("Congratulations! You won!");
                System.out.println("The word was: " + word);
                break;
            }
        }

        if (game.getLives() == 0) {
            System.out.println("____");
            System.out.println("|  |");
            System.out.println("|  O");
            System.out.println("| /|\\");
            System.out.println("|  |");
            System.out.println("| / \\");
            System.out.println("-");
            System.out.println("Game Over! You lost!");
            System.out.println("The word was: " + word);
        }
    }
}
