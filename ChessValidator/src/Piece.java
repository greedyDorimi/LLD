public abstract class Piece {
    private Boolean white;
    private Boolean killed;

    public Piece(Boolean white) {
        this.white = white;
        this.killed = false;
    }

    public Boolean getWhite() {
        return white;
    }

    public void setWhite(Boolean white) {
        this.white = white;
    }

    public Boolean getKilled() {
        return killed;
    }

    public void setKilled(Boolean killed) {
        this.killed = killed;
    }

    public abstract Boolean canMove(Board board, Cell start, Cell end);
}
