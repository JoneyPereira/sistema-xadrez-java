package com.redua.boardgame;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Position {
    
    @Getter @Setter
    private int row;

    @Getter @Setter
    private int column;

    @Override
    public String toString(){

        return row + " , " + column;

    }
    
}
