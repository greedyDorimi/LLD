import java.util.ArrayList;
import java.util.List;

public class Game {

    public ArrayList<User> players;
    public User currentPlayer;
    public TwoDimensionalBoard board;

    public Integer total_players;

    public Game(ArrayList<User> players) {
        this.players = players;
        this.board = new TwoDimensionalBoard(3, 3);
        total_players = players.size();
    }

    public ArrayList<User> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<User> players) {
        this.players = players;
    }

    public boolean noMovesRemaining() {
        for(int i = 0; i < board.getWidth(); i++) {
            for(int j = 0; j < board.getHeight(); j++) {
                if(board.getGameBoard().get(i).get(j) != "")return false;
            }
        }
        return true;
    }
    public boolean isDraw() {
        return noMovesRemaining();
    }

    public boolean rowWise() {
        for(int j = 0; j < board.getHeight(); j++) {
            boolean flag = true;
            String current_symbol = currentPlayer.getSymbol();
            for(int i = 0; i < board.getWidth(); i++) {
                if(board.getGameBoard().get(i).get(j) != current_symbol) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(currentPlayer.getName() + "has won the Game!");
                return true;
            }
        }
        return false;
    }

    public boolean columnWise() {
        for(int i = 0; i < board.getWidth(); i++) {
            boolean flag = true;
            String current_symbol = currentPlayer.getSymbol();
            for(int j = 0; j < board.getHeight(); j++) {
                if(board.getGameBoard().get(i).get(j) != current_symbol) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(currentPlayer.getName() + "has won the Game!");
                return true;
            }
        }
        return false;
    }

    public boolean diagonally() {
        String current_symbol = currentPlayer.getSymbol();
        boolean flag = true;
        // left diagonal
        for(int i = 0; i < board.getWidth(); i++) {
            if(board.getGameBoard().get(i).get(i) != current_symbol) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(currentPlayer.getName() + "has won the Game!");
            return true;
        }
        // right diagonal
        flag = true;
        int board_size = board.getWidth();
        for(int i = 0; i < board.getWidth(); i++) {
            if(board.getGameBoard().get(board_size - i - 1).get(board_size - i - 1) != current_symbol) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(currentPlayer.getName() + "has won the Game!");
            return true;
        }
        return false;
    }
    public boolean winnerAnnounced() {
        if(rowWise() || columnWise() || diagonally()) {
            return true;
        }
        return false;
    }

    public User getNextPlayer() {
        User next_player = null;
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i) == currentPlayer) {
                if(i == players.size()-1) {
                    next_player = players.get(0);
                }
                next_player =  players.get(i+1);
            }
        }
        if (next_player == null) {
            System.out.println("Current player does not exists!");
        }
        return next_player;
    }
    public void play(User player, List<Integer> move) {
        currentPlayer = player;
        if(isDraw() || winnerAnnounced()) {
            return;
        }
    }
}
