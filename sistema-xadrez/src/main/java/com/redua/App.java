package com.redua;
import com.redua.chess.ChessMatch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoad(chessMatch.getPiece());
    }
}
