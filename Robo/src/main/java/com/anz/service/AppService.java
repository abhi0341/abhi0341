package com.anz.service;

import com.anz.models.*;
import com.anz.utility.Utilty;

/**
 * Author: Abhirup Das
 * Description: The controller class that addresses all requests coming in
 */
public class AppService {

    SquareTable table;
    Robot toyRobot;
    boolean started = false;

    public SquareTable getTable() {
        return table;
    }

    public void setTable(SquareTable table) {
        this.table = table;
    }

    public Robot getToyRobot() {
        return toyRobot;
    }

    public void setToyRobot(Robot toyRobot) {
        this.toyRobot = toyRobot;
    }

    public void doAction(String input){
        Utilty appUtils = new Utilty();
        Location currentLocation;
        if(!started) {
            currentLocation = appUtils.isValidStart(input);
            if(currentLocation!=null){
                toyRobot.place(currentLocation);
                started = true;
                System.out.println("Toy Robot Placed and Ready to Move");
                return;
            }else {
                return;
            }

        }
        String in[] = input.split(" ");
        Command inputCommand = appUtils.getCommand(in[0]);

        switch (inputCommand){
            case PLACE:
                currentLocation = appUtils.validatePlace(in);
                if(currentLocation!=null){
                    toyRobot.place(currentLocation);
                    System.out.println("PLACE execution successful.");
                }else {
                    System.out.println("ERROR in executing PLACE");
                }
                break;
            case MOVE:
                currentLocation = toyRobot.getLocation().next();
                if(currentLocation!=null){
                    if(table.isValidLocation(currentLocation)){
                        toyRobot.move(currentLocation);
                        System.out.println("MOVE execution successful.");
                    }
                }else {
                    System.out.println("ERROR in executing MOVE");
                }
                break;
            case LEFT:
                toyRobot.turnLeft();
                System.out.println("Changed Direction Successful");
                break;
            case RIGHT:
                toyRobot.turnRight();
                System.out.println("Changed Direction Successful");
                break;
            case REPORT:
                toyRobot.reportLocation();
                break;
            default:
                System.out.println("INVALID ENTRY !");
        }

        // end of actions
    }

}
