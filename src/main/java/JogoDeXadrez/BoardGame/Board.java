package JogoDeXadrez.BoardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pisces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pisces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    public Piece piece(int row, int columns){
        return pisces[row][columns];
    }
    public Piece piece(Position position){
        return pisces[position.getRow()][position.getColum()];
    }
}
