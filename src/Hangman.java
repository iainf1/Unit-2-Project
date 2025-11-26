public class Hangman {
    private String hangmanWord;
    private String foundLetters;
    private int lives = 6;

    public Hangman(String word) {
        hangmanWord = word;
        foundLetters = "";
        for (int i = 0; i < word.length(); i++) {
            foundLetters += "_";
        }
    }

    public int getLives() {
        return lives;
    }

    public String getFoundLetters() {
        return foundLetters;
    }


    public String lettersFound(String guess) {
        char guessChar = guess.charAt(0);
        boolean found = false;

        if (foundLetters.indexOf(guessChar) >= 0) {
            System.out.println("Already guessed this letter");
            return foundLetters;
        }

        String newFoundLetters = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            if (hangmanWord.charAt(i) == guess.charAt(0)) {
                newFoundLetters += guessChar;
                found = true;
            } else {
                newFoundLetters += foundLetters.charAt(i);
            }
        }
        foundLetters = newFoundLetters;

        if (!found) {
            lives--;
        }
        return foundLetters;
    }

    public void displayHangman(int lives) {
        if (lives == 6) {
            System.out.println("____");
            System.out.println("|  |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("-");
        }
                    else if (lives == 5) {
                        System.out.println("____");
                        System.out.println("|  |");
                        System.out.println("|  O");
                        System.out.println("|");
                        System.out.println("|");
                        System.out.println("|");
                        System.out.println("-");
                    }
                    else if (lives == 4) {
                        System.out.println("____");
                        System.out.println("|  |");
                        System.out.println("|  O");
                        System.out.println("|  |");
                        System.out.println("|  |");
                        System.out.println("|");
                        System.out.println("-");
                    }

                    else if (lives == 3) {
                        System.out.println("____");
                        System.out.println("|  |");
                        System.out.println("|  O");
                        System.out.println("|  |");
                        System.out.println("|  |");
                        System.out.println("| /");
                        System.out.println("-");
                    }
                    else if (lives == 2) {
                        System.out.println("____");
                        System.out.println("|  |");
                        System.out.println("|  O");
                        System.out.println("|  |");
                        System.out.println("|  |");
                        System.out.println("| / \\");
                        System.out.println("-");
                    }
                    else if (lives == 1) {
                        System.out.println("____");
                        System.out.println("|  |");
                        System.out.println("|  O");
                        System.out.println("| /|");
                        System.out.println("|  |");
                        System.out.println("| / \\");
                        System.out.println("-");
                    }
                }
            }