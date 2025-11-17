public class Hangman {
    private String hangmanWord;
    public Hangman(String word) {
        hangmanWord = word;
        String hangmanWordBlanks = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            hangmanWordBlanks += "_";
        }
    }


    public String lettersFound (String guess) {
        String foundLetters = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            if (hangmanWord.charAt(i) == guess.charAt(0)) {
                foundLetters += guess.charAt(0);
            } else {
                //have to make a method for subtracting a body part;
            }
        }
        return foundLetters;
    }
}

