public class Hangman {
    private String hangmanWord;
    public Hangman(String word) {
        hangmanWord = word;
        String hangmanWordBlanks = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            hangmanWordBlanks += "_";
        }
    }
//public letterBlanks() {
//for (int i = 0; i < hangmanWord.length(); i++) {
//    char blankLetter = new char;
//   blankLetter = hangmanWord.charAt(i);
//  }
//}

    public String lettersFound (String guess) {
        String foundLetters = "";
        int lives = 6;
        for (int i = 0; i < hangmanWord.length(); i++) {
            if (hangmanWord.charAt(i) == guess.charAt(0)) {
                foundLetters += guess.charAt(0);
                
            }
            else {
                if (foundLetters.indexOf(guess.charAt(0))>=0) {
                    System.out.println("Already guessed this letter");
                }
                else {
                    lives = lives-1;
                    if (lives = 5) {
                        System.out.println("")
                    }

                    //subtract lives
                }
            }
        }
        return foundLetters;
    }
}

