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

    //check board for all possible 3 in a row combos
    public boolean checkWin(){
        //start with checking horizontally
        //in index 0, get value, if values in index 1 and 2 are the same:
        //thats a win!

        int horC;
        //horizontal check loop
        for(int i = 0; i < 3; i++){
            horC = getCellData(i);
            //if zero, then nobody moved here so just break
            if(horC == 0)
                break;

            if(horC == getCellData(i+1) && horC == getCellData(i+2)){
                //WE HAVE A WINNER!
                //if this is true
                return true;
            }
        }

        int verC;
        //this should pretty much be the same with different indices
        for(int i = 0; i < 3; i++){
            verC = getCellData(i);
            if(verC == 0)
                break;

            if(verC == getCellData(i+3) && verC == getCellData(i+6)){
                return true;
            }
        }

        int diaC;
        //diagonal win checking, slightly different as no loop to do this
        //diagonal 1
        diaC = getCellData(0);
        if(diaC == 0) {
            return false;
        }
        if(diaC == getCellData(4) && diaC == getCellData(8)) {
            return true;
        }
        //diagonal 2
        diaC = getCellData(2);
        if(diaC == 0) {
            return false;
        }
        if(diaC == getCellData(4) && diaC == getCellData(6)) {
            return true;
        }

        //if we made it here no win conditions met
        return false;
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
