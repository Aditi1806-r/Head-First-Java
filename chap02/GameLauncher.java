package chap02;

public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        System.out.println("GameLaunching");
        game.startGame();
    }
}
