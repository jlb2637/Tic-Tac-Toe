package com.company;

import java.util.*;

public class Player {

    int pnum;

    //setting up keyboard input for console version
    Scanner keyboard = new Scanner(System.in);

    //contains information related to the player
    public Player(int playerNum){
        pnum = playerNum;
    }
    //gets the 'ID' number of player
    //for checking which player made a move
    public int getNum(){
        return pnum;
    }
    //for console based version:
    public void PrintTurnConsole(){
        System.out.println("It's player " + pnum + "'s turn!");
    }

    //get input from the player
    //biggest catch here is to check they chose a valid move
    public int GetMoveConsole(Board board){
        System.out.println("Please enter a number 1-9: ");
        int x = keyboard.nextInt();
        //we want the user to input a position 1-9
        //1 being the top left, 9 being bottom right
        //123
        //456
        //789

        //making sure number is 1-9 and not already used
        if (x > 9 || x < 1){
            System.out.println("Invalid move please enter a number 1-9: ");
            x = GetMoveConsole(board);
        }
        if(board.getCellData(x-1) !=0){
            System.out.println("cell already taken, please choose another");
            x = GetMoveConsole(board);

        }
        return x;
    }
}
