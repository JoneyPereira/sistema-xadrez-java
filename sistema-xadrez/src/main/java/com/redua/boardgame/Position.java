package com.redua.boardgame;

import lombok.Getter;
import lombok.Setter;

public class Position {
    
    @Getter @Setter
    private int row;

    @Getter @Setter
    private int column;

    @Override
    public String toString(){

        return row + " , " + column;

    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }   
}
