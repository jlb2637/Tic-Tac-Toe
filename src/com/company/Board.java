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

    //required getter for checking valid moves
    public int getCellData(int cell){
        return Data[cell];
    }

    //this will reset the array containing all x and o info
    public void ClearBoard(){
        //THIS IS NEW THATS COOL
        Arrays.fill(Data, 0);
    }

    //based on given player place an x or o in the given position
    //for player 1, use x's, player 2, use o's
    public void placePiece(Player player, int position){
        if(player.getNum() == 1){
            Data[position] = 1;
        } else if(player.getNum() == 2){
            Data[position] = 2;
        } else {
            System.out.println("There was an error somewhere, either a player did not move or player ID is wrong");
        }

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

        //parsing the 1's and zeros into a new array of x's and o's for
        //a nicer user experience
        char[] Cdata = new char[9];
        for(int i = 0; i < Data.length; i++){
            if(Data[i] == 0){
                Cdata[i] = ' ';
            }else if(Data[i]  == 1){
                Cdata[i] = 'x';
            }else if(Data[i] == 2){
                Cdata[i] = 'o';
            }
        }

        //thought about making extra methods or loops for these lines but that felt extra
        //for a very simple task
        System.out.println(Cdata[0] + " | " + Cdata[1] + " | " + Cdata[2]);
        System.out.println("--|---|--");
        System.out.println(Cdata[3] + " | " + Cdata[4] + " | " + Cdata[5]);
        System.out.println("--|---|--");
        System.out.println(Cdata[6] + " | " + Cdata[7] + " | " + Cdata[8]);

    }
}
