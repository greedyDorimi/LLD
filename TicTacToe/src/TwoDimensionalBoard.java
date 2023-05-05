import java.util.ArrayList;

public class TwoDimensionalBoard implements Board{
    private int width;
    private int height;
    private ArrayList<ArrayList<String>> gameBoard;

    public TwoDimensionalBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.gameBoard = new ArrayList<>();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<ArrayList<String>> getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(ArrayList<ArrayList<String>> gameBoard) {
        this.gameBoard = gameBoard;
    }
}
