import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadderService {
    private static final Integer DEFAULT_BOARD_SIZE = 100;
    private Board board;
    private Queue<Player> players;

    private Boolean gameCompleted;
    public SnakeLadderService() {
        this.board = new Board(SnakeLadderService.DEFAULT_BOARD_SIZE);
        this.gameCompleted = false;
        this.players = new LinkedList<>();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Boolean getGameCompleted() {
        return gameCompleted;
    }

    public void setGameCompleted(Boolean gameCompleted) {
        this.gameCompleted = gameCompleted;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Queue<Player> players) {
        for (Player player: players) {
            this.players.add(player);
            board.getPlayerPosition().put(player.getId(), 0);
        }
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        board.setSnakes(snakes);
    }

    public void setLadders(ArrayList<Ladder> ladders) {
        board.setLadders(ladders);
    }

    public void startGame() {
        while(!gameCompleted) {
            Player currentPlayer = players.poll();
            Integer curPosition = board.getPlayerPosition().get(currentPlayer.getId());
            Integer diceValue = Dice.getDiceValue();
            System.out.println(currentPlayer.getName() + " has got dice value of " + diceValue);
            Integer nextPosition = curPosition + diceValue;
            nextPosition = checkForSnakeLadders(nextPosition);
            if (nextPosition > board.getSize()) {
                nextPosition = curPosition;
            }
            board.getPlayerPosition().put(currentPlayer.getId(), nextPosition);
            System.out.println(currentPlayer.getName() + " has moved from " + curPosition + " to " + nextPosition);
            if(nextPosition == board.getSize()) {
                announceWinner(currentPlayer);
                gameCompleted = true;
                break;
            }
            players.add(currentPlayer);
        }
    }

    private Integer checkForSnakeLadders(Integer nextPosition) {
        Integer prevPosition;
        do {
            prevPosition = nextPosition;
            for (Snake snake: board.getSnakes()) {
                if (snake.getHead() == nextPosition) {
                    System.out.println("Bitten by Snake at " + snake.getHead() + " player now comes at " + snake.getHead());
                    nextPosition = snake.getTail();
                }
            }
            for (Ladder ladder: board.getLadders()) {
                if (ladder.getStart() == nextPosition) {
                    System.out.println("Climbed a Ladder at " + ladder.getStart() + " player now comes at " + ladder.getEnd());
                    nextPosition = ladder.getEnd();
                }
            }
        } while(prevPosition != nextPosition);
        return nextPosition;
    }

    private void announceWinner(Player player) {
        System.out.println(player.getName() + " has won the game!");
    }
}
