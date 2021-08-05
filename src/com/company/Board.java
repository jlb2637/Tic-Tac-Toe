package com.company;

import java.util.Arrays;

public class Board {
    //using a 1D array bc it just seems simplest
    //an 'x' will be defined as a 1, an 'o' will be defined as a 2
    int[] Data;

    public Board(){

        Data = new int[9];
    }

    //methods

    //this will reset the array containing all x and o info
    public void ClearBoard(){
        //THIS IS NEW THATS COOL
        Arrays.fill(Data, 0);
    }

    //based on given player place an x or o in the given position
    public void placePiece(Player player, int position){


    }

    public void displayBasicBoard(){
        //this is gonna be a console board display
        /*
        ex: x | o | o
            --|---|--
            o | x | o
            --|---|--
            x | x | x

        print's that take the data from corresponding array positions
         */
        //thought about making extra methods or loops for these lines but that felt extra
        //for a very simple task
        System.out.println(Data[0] + " | " + Data[1] + " | " + Data[2]);
        System.out.println("--|---|--");
        System.out.println(Data[3] + " | " + Data[4] + " | " + Data[5]);
        System.out.println("--|---|--");
        System.out.println(Data[6] + " | " + Data[7] + " | " + Data[8]);

    }
}
