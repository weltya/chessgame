package Model;

public class PieceFactory {
    private static PieceFactory instance;

    PieceFactory() {}

    public PieceFactory createInstancePiecefactory()
    {
        if(instance == null)
            instance = new PieceFactory();
        return instance;
    }


    public Piece createKing(Color2 color, int position)
    {
        return King.createInstanceKing(color, position);
    }
    public Piece createQueen(Color2 color, int position)
    {
        return new Queen(color, position);
    }
    public Piece createRook(Color2 color, int position)
    {
        return new Rook(color, position);
    }
    public Piece createBishop(Color2 color, int position)
    {
        return new Bishop(color, position);
    }
    public Piece createKnight(Color2 color, int position)
    {
        return new Knight(color, position);
    }
    public Piece createPawn(Color2 color, int position)
    {
        return new Pawn(color, position);
    }
}
