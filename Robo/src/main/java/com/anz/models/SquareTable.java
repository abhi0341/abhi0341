package com.anz.models;

/**
 * Author: Abhirup Das
 * Description: SquareTable class
 */
public class SquareTable {

    private int xPos;
    private int yPos;

    public SquareTable(int edge){
        xPos=yPos=edge-1;
    }

    public boolean isValidLocation(Location location){
        if(location.getxPos()>=0 && location.getxPos()<=xPos
            && location.getyPos()>=0 && location.getyPos() < yPos)
                return true;
        else{
            System.out.println("Target Location invalid");
            return false;
        }
    }

}
