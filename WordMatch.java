public class WordMatch {
    private String secret; //this is the state!!

    public WordMatch(String secret) {
        this.secret = secret;
    }
    //FOR NOW, return 1 if guess is in secret, and -1 if it's not
    public int ScoreGuess(String guess){
        int n = 0;
        char s, g;
        for(int i=0; i < secret.length(); i++){
            for(int j = 0; j < guess.length(); j++){
                s = secret.charAt(i + j);
                g = guess.charAt(j);
                if s != g {
                    break;
                }
            }
            if(s == g){
                return 1;
            }
        }
        return -1;
    }
}
