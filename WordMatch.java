public class WordMatch {
    private String secret;

    public WordMatch(String secret) {
        this.secret = secret;
    }
    public int ScoreGuess(String guess){
        int slen = secret.length();
        int glen = guess.length();
        if (glen>slen){
            return 0;
        }
        int freq = 0;
        for(int i=0;i<slen-glen+1;i++){
            boolean match = true;
            for(int j=0;j < glen; j++){
                if(secret.charAt(i+j)!=guess.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                freq++;
            }
        }
        return freq * glen * glen;
    }
}
