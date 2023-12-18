public class Main {
    WordMatch wm;
    Ui ui;
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        wm = new WordMatch("mississippi");
        ui = new Ui();
        String guess = ui.inputString("what is your guess?");
        int score = wm.ScoreGuess(guess);
        System.out.println("Your score is " + score);

    }
}
