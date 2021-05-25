package JogoDeXadrez.Chess;

import JogoDeXadrez.BoardGame.Board;
import JogoDeXadrez.BoardGame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
