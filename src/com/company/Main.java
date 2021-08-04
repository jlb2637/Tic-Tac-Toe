package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        /*general structure notes:
        -this class will be where all the action happens
            -use game class functions to 'play'
        -a board class that contains all of the gama data
                -probably a type of array
                -possible graphics here
        -a game class
                -check for if anyone won, let whoevers turn it is play
        -?? a player class
                -create a player object to interact with the board
                should contain things like make a move or
                    end current players turn
        */


        //testing out board class so far!
        Board board = new Board();
        board.ClearBoard();
        board.displayBasicBoard();
        
    }

}
