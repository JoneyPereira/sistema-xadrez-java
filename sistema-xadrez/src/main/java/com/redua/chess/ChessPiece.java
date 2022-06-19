package com.redua.chess;

import com.redua.boardgame.Board;
import com.redua.boardgame.Piece;

import lombok.Getter;

public class ChessPiece extends Piece{

    @Getter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }    

}