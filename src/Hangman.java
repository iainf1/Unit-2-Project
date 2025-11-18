public class Hangman {
    private String hangmanWord;
    public Hangman(String word) {
        hangmanWord = word;
        String hangmanWordBlanks = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            hangmanWordBlanks += "_";
        }
    }
public letterBlanks() {
        String blankLetter = "";
for (int i = 0; i < hangmanWord.length(); i++) {
   hangmanWord.charAt(i) =
  }
}

    public String lettersFound (String guess) {
        String foundLetters = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            if (hangmanWord.charAt(i) == guess.charAt(0)) {
                foundLetters += guess.charAt(0);
                
            }
            else {
                if (foundLetters.indexOf(guess.charAt(0))>=0) {
                    System.out.println("Already guessed this letter");
                }
                else {
                    //subtract lives
                }
            }
        }
        return foundLetters;
    }
}

