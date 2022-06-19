package com.redua.chess;

import com.redua.boardgame.Board;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }   
    
}
