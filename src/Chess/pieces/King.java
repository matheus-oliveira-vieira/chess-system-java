package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class King extends ChessPiece {

  public King(Board board, Color color) {
    super(board, color);
  }

  @Override
  public String toString() {
    return getColor() == Color.WHITE ? "\u2654" : "\u265A"; // \u2654 é ♔ e \u265A é ♚
  }
  
}
