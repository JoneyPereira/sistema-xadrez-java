package com.redua.chess;

import com.redua.boardgame.Board;
import com.redua.boardgame.Position;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }
    
    public ChessPiece[][] getPiece(){

        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int i=0; i<board.getRows(); i++){
            for(int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rock(board, Color.WHITE), new Position(4,4));
        board.placePiece(new King(board, Color.BLACK), new Position(1, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
