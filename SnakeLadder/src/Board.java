import java.util.ArrayList;
import java.util.HashMap;

public class Board {
    private Integer size;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladders;
    private HashMap<String, Integer> playerPosition;

    public Board(Integer size) {
        this.size = size;
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        this.playerPosition = new HashMap<>();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ArrayList<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public ArrayList<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(ArrayList<Ladder> ladders) {
        this.ladders = ladders;
    }

    public HashMap<String, Integer> getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(HashMap<String, Integer> playerPosition) {
        this.playerPosition = playerPosition;
    }
}
