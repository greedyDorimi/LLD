public class Pawn extends Piece {

    public Pawn(Boolean white) {
        super(white);
    }

    @Override
    public Boolean canMove(Board board, Cell start, Cell end) {
        return null;
    }
}
