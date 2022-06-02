package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        pawn.setPieceColor(pieceColor);

        if (EmptyPosition(xCoordinate , yCoordinate) == true){
            if (pawn.getPieceColor().equals(PieceColor.BLACK) && xCoordinate < 7 && yCoordinate < 7
            || pawn.getPieceColor().equals(PieceColor.WHITE) && xCoordinate < 7 && yCoordinate < 0){
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                this.pieces[xCoordinate][yCoordinate] = pawn;

            }else {
                pawn.setXCoordinate(-1);
                pawn.setYCoordinate(-1);
            }
        }

    }

    public boolean EmptyPosition(int xCoordinate, int yCoordinate) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            if (pieces[xCoordinate][yCoordinate] == null){
                return true;
            }
        }
        return false;
    }


    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate < pieces[0].length && xCoordinate >= 0
            && yCoordinate < pieces.length && yCoordinate >= 0){
            return true;
        }
        return false;
    }
}
