import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Player> players = new LinkedList<>();
        System.out.println("Enter number of Players");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            players.add(new Player(sc.next()));
        }
        SnakeLadderService snakeLadderService = new SnakeLadderService();
        snakeLadderService.setPlayers(players);
        System.out.println("Enter number of Snakes");
        n = sc.nextInt();
        ArrayList<Snake> snakes = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            snakes.add(new Snake(sc.nextInt(), sc.nextInt()));
        }
        ArrayList<Ladder> ladders = new ArrayList<>();
        System.out.println("Enter number of Ladders");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            ladders.add(new Ladder(sc.nextInt(), sc.nextInt()));
        }
        snakeLadderService.setSnakes(snakes);
        snakeLadderService.setLadders(ladders);
        snakeLadderService.startGame();
    }
}