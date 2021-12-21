package com.anz.models;

/**
 * Author: Abhirup Das
 * Description: Location class which also provides next location definition
 */
public class Location {

    private int xPos;
    private int yPos;
    Direction direction;

    public Location(int x, int y, Direction direction) {
        this.xPos = x;
        this.yPos = y;
        this.direction = direction;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public Location next() {
        Location newLocation = new Location(0,0,null);
        newLocation.setDirection(this.direction);
        switch (this.direction) {
            case NORTH:
                newLocation.setxPos(xPos);
                newLocation.setyPos(yPos + 1);
                break;
            case EAST:
                newLocation.setxPos(xPos + 1);
                newLocation.setyPos(yPos);
                break;
            case SOUTH:
                newLocation.setxPos(xPos);
                newLocation.setyPos(yPos-1);
                break;
            case WEST:
                newLocation.setxPos(xPos-1);
                newLocation.setyPos(yPos);
                break;
        }
        return newLocation;
    }


}
