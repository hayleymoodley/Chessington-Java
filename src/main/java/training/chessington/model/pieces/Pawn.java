package training.chessington.model.pieces;

import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pawn extends AbstractPiece {
    private PlayerColour colour;

    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        List<Move> allowedMoves = new ArrayList<>();

        //CODE FOR THE SECOND PART OF CHALLENGE -2
        if (PlayerColour.WHITE == this.getColour()) {
            Coordinates to = new Coordinates(from.getRow() - 2, from.getCol());
            allowedMoves.add(new Move(from, to));
        } else if (PlayerColour.BLACK == this.getColour()) {
            Coordinates to = new Coordinates(from.getRow() + 2, from.getCol());
            allowedMoves.add(new Move(from, to));
        }
        return allowedMoves;

    }

}





//        //CODE FOR THE FIRST PART OF CHALLENGE - 1
//        Coordinates to = new Coordinates(from.getRow() - 2, from.getCol());
//        allowedMoves.add(new Move(from, to));
//        return allowedMoves;

        //CODE FOR THE FIRST PART OF CHALLENGE - 2
//        Coordinates to = new Coordinates(from.getRow() - 2, from.getCol());
//        allowedMoves.add(new Move(from, to));
//        return allowedMoves;

//         //CODE FOR THE SECOND PART OF CHALLENGE -1
//        if(PlayerColour.WHITE == this.getColour()){
//            Coordinates to = new Coordinates(from.getRow()-1, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        }
//        else if(PlayerColour.BLACK == this.getColour()){
//            Coordinates to = new Coordinates(from.getRow()+1, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        }
//        return allowedMoves;
//
//    }





