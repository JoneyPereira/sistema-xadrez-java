package com.redua;
import com.redua.boardgame.Position;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Position pos = new Position();
        pos.setRow(4);
        pos.setColumn(5);

        System.out.println("A posição é: " + pos);


    }
}
