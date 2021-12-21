package com.anz.utility;

import com.anz.models.Command;
import com.anz.models.Direction;
import com.anz.models.Location;

/**
 * Author: Abhirup Das
 * Description: Utility Class to various validations
 */
public class Utilty {

    public Command getCommand(String input){
        try {
            return Command.valueOf(input);
        }catch(Exception e){
            System.out.println("Invalid Command :: " + input);
            return null;
        }
    }
    public Location isValidStart(String input){
        String[] in = input.split(" ");

        Command command = getCommand(in[0]);
        if(command==null){
            return null;
        }
        if(command != Command.PLACE){
            System.out.println("Use PLACE to START");
            return null;
        }
        return validatePlace(in);
    }

    public Location validatePlace(String[] param){
        Direction direction;
        if(param.length != 2){
            System.out.println("Incorrect Syntax to PLACE. USE :: PLACE X,Y,NORTH|SOUTH|EAST|WEST");
            return null;
        }
        String[] args = param[1].split(",");
        if(args.length!=3){
            System.out.println("Incorrect Syntax to PLACE. USE :: PLACE X,Y,F where F is Direction Facing ");
            return null;
        }
        try{
            direction = Direction.valueOf(args[2]);
        }catch (Exception e){
            System.out.println("Incorrect Direction, Use NORTH, EAST, SOUTH, WEST.");
            return null;
        }

        // valid case
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            if(x<0 || y<0){
                System.out.println("PLACE :: X and Y coordinates cannot be negative !");
                return null;
            }
            direction = Direction.valueOf(args[2]);
            return new Location(x,y,direction);
        }catch (Exception e){
            System.out.println("Invalid args to place Command");
            return null;
        }
    }


}
