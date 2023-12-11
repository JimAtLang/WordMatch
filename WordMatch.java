public class WordMatch {
    private String secret; //this is the state!!

    public WordMatch(String secret) {
        this.secret = secret;
    }
    //FOR NOW, return 1 if guess is in secret, and -1 if it's not
    public int ScoreGuess(String guess){
        for(int i=0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            
        }
        return 0;
    }
}
