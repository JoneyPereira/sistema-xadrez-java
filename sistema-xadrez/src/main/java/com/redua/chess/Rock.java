package com.redua.chess;

import com.redua.boardgame.Board;

public class Rock extends ChessPiece {

    public Rock(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
