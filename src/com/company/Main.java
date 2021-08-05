package com.company;

public class Main {

    public static void main(String[] args) {

        /*general structure notes:
        -this class will be where all the action happens
            -use game class functions to 'play'
        -a board class that contains all of the gama data
                -probably a type of array
                -possible graphics here
        -a game class
                -check for if anyone won, let whoevers turn it is play
        - a player class
                -create a player object to interact with the board
                should contain things like make a move and
                announce whos turn it is

        */


        //board setup
        Board board = new Board();
        board.ClearBoard();
        board.displayBasicBoard();

        //player setup
        Player p1 = new Player(1);
        Player p2 = new Player(2);

        boolean play = true;
        int g;
        //loop so that people can play again without restarting
        while(play) {

            //game loop setup
            boolean win = false;
            int move;

            //official game loop
            //until the win condition of 3 in a row is satisfied the game keeps going
            while (!win) {

                //player 1's turn
                p1.PrintTurnConsole();
                move = p1.GetMoveConsole(board);
                //for player convenience (1-9 choice instead of 0-8)
                //subract one from move
                move--;
                board.placePiece(p1, move);
                board.displayBasicBoard();

                //win condition check
                win = board.checkWin();
                //this one needs to break if it gets set true,
                //otherwise player 2 gets an extra turn
                if (win) {
                    System.out.println("Player 1 wins!");
                    break;
                }
                //player 2's turn
                p2.PrintTurnConsole();
                move = p2.GetMoveConsole(board);
                move--;
                board.placePiece(p2, move);
                board.displayBasicBoard();

                //win condition check
                win = board.checkWin();
                //adding this break just so we can say which player won
                if (win) {
                    System.out.println("Player 2 wins!");
                    break;
                }
            }
            System.out.println("To play again, type 1 and press enter, any other entry will exit");
            g = p1.GetInput();
            if(g == 1)
                play = false;
        }
    }
}
