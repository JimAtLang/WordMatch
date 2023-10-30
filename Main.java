public class Main {
    WordMatch wm = new WordMatch("mississippi");
    Ui ui = new Ui();
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        String guess = ui.inputString("what is your guess?");
        int score = wm.ScoreGuess(guess);
        System.out.println("Your score is " + score);

    }
}
