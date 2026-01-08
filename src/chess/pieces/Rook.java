package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

  public Rook(Board board, Color color) {
    super(board, color);
  }

  @Override
  public String toString() {
    return getColor() == Color.WHITE ? "\u2656" : "\u265C"; // \u2656 é ♖ e \u265C é ♜
  }
}
