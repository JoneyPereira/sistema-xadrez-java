package com.redua;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua mensagem:");
        String msg = sc.nextLine();
        System.out.println("A sua mensagem: " + msg);
       sc.close();
    }
}
