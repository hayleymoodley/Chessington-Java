package training.chessington.model.pieces;

import com.sun.prism.image.Coords;
import training.chessington.model.Board;
import training.chessington.model.Coordinates;
import training.chessington.model.Move;
import training.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.sun.org.apache.bcel.internal.generic.InstructionConstants.bla;

public class Pawn extends AbstractPiece {
    private PlayerColour colour;
    private Piece.PieceType type;

    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        List<Move> allowedMoves = new ArrayList<>();
        if (PlayerColour.WHITE == this.getColour()) {
            Coordinates to = new Coordinates(from.getRow()-2, from.getCol());
            if (to == new Coordinates(4, 4)) {
                allowedMoves.removeAll(allowedMoves);
            } else ;
            allowedMoves.removeAll(allowedMoves);
            //allowedMoves.add(new Move(from, to));
        } else if (PlayerColour.BLACK == this.getColour()) {
            Coordinates to = new Coordinates(from.getRow()+2, from.getCol());
            Coordinates too = to;
            System.out.println(to);
            if (to == new Coordinates(3, 4)) {
                allowedMoves.removeAll(allowedMoves);
            } else if (to != new Coordinates(3, 4)) ;
            {
                 allowedMoves.removeAll(allowedMoves);
                //allowedMoves.add(new Move(from, to));


            }
        }
        System.out.println(allowedMoves);
        return allowedMoves;

    }

}




//        //CODE FOR THE TEST " whitePawn/blackPawnCannotMoveUpTwoSquaresIfAlreadyMoved"
//        if (PlayerColour.WHITE == this.getColour()) {
//            Coordinates to = new Coordinates(from.getRow() - 1, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        } else if (PlayerColour.BLACK == this.getColour()) {
//            Coordinates to = new Coordinates(from.getRow() + 1, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        }
//        else if (allowedMoves.isEmpty()) {
//            Coordinates to = new Coordinates(from.getRow() + 2, from.getCol());
//            allowedMoves.add(new Move(from,to));
//        }
//        return allowedMoves;



//        if(allowedMoves.isEmpty()){
//            Coordinates to = new Coordinates(from.getRow() - 1, from.getCol());
//        }
//            return allowedMoves;

//        Coordinates to = new Coordinates(from.getRow() - 1, from.getCol());
//        allowedMoves.add(new Move(from, to));
//        if(allowedMoves.contains(to)) {
//
//        return allowedMoves;



//        //CODE FOR THE SECOND PART OF CHALLENGE -2
//        if (PlayerColour.WHITE == this.getColour()) {
//            Coordinates to = new Coordinates(from.getRow() - 2, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        } else if (PlayerColour.BLACK == this.getColour()) {
//            Coordinates to = new Coordinates(from.getRow() + 2, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        }
//        return allowedMoves;
//    }

//    }
//}
////
//    }
//
//}


//        //CODE FOR THE FIRST PART OF CHALLENGE - 1
//        Coordinates to = new Coordinates(from.getRow() - 1, from.getCol());
//        allowedMoves.add(new Move(from, to));
//        return allowedMoves;

//
//        //CODE FOR THE FIRST PART OF CHALLENGE - 2
//        Coordinates to = new Coordinates(from.getRow() - 2, from.getCol());
//        allowedMoves.add(new Move(from, to));
//        return allowedMoves;



//        //CODE FOR THE SECOND PART OF CHALLENGE -1
//        if (PlayerColour.WHITE == this.getColour()) {
//            Coordinates to = new Coordinates(from.getRow() - 1, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        } else if (PlayerColour.BLACK == this.getColour()) {
//            Coordinates to = new Coordinates(from.getRow() + 1, from.getCol());
//            allowedMoves.add(new Move(from, to));
//        }
//        return allowedMoves;








