package com.anz.models;

/**
 * Author: Abhirup Das
 * Description: Direction enum and clockwise and anti-clockwise movement
 */
public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    // Right is clockwise
    public Direction right(){
        switch (this){
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
            default: return null;
        }
    }

    // Left is Anti-Clockwise
    public Direction left(){
        switch (this){
            case NORTH: return WEST;
            case WEST: return SOUTH;
            case SOUTH: return EAST;
            case EAST: return NORTH;
            default: return null;
        }
    }
}
