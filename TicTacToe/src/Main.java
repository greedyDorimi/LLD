import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User player1 = new User(1, "Ram", "X");
        User player2 = new User(2, "Shyam", "O");

        ArrayList<User> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game(players);
        while (true) {
            ArrayList<Integer> move1 = player1.askMove();
            game.play(player1, move1);
            ArrayList<Integer> move2 = player2.askMove();
            game.play(player2, move2);
        }
    }
}