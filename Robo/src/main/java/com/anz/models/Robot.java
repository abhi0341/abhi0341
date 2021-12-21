package com.anz.models;

/**
 * Author: Abhirup Das
 * Description: Robot class its attributes and behaviour
 */
public class Robot {

    // Robot will always have a location
    private Location location;

    public Location getLocation() {
        return location;
    }

    private void setLocation(Location location) {
        this.location = location;
    }

    public void place(Location location){
        if(location!=null) {
            this.location = location;
        }
    }
    public void move(Location location){
        if(location!=null) {
            this.location = location;
        }
    }

    public void turnRight(){
        location.setDirection(location.direction.right());
    }

    public void turnLeft(){
        location.setDirection(location.direction.left());
    }

    public void reportLocation(){
        System.out.println("Current Location is :: " + location.getxPos() +
                ", " + location.getyPos() + ", " + location.getDirection());
    }


}
