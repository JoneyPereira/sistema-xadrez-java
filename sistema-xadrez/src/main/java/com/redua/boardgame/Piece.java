package com.redua.boardgame;

import lombok.Getter;

public class Piece {

    protected Position position;

    @Getter
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

}
